/*******************************************************************************
 * Copyright (c) 2017 Inria and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Inria - initial API and implementation
 *******************************************************************************/
package org.eclipse.gemoc.timeline.view;

import org.eclipse.gemoc.timeline.Activator;
import org.eclipse.gemoc.timeline.editpart.BranchEditPart;
import org.eclipse.gemoc.timeline.editpart.ChoiceEditPart;
import org.eclipse.gemoc.timeline.editpart.PossibleStepEditPart;
import org.eclipse.gemoc.timeline.editpart.TimelineEditPartFactory;
import org.eclipse.gemoc.timeline.model.ITimelineWindowListener;
import org.eclipse.gemoc.timeline.model.TimelineWindow;

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.NotEnabledException;
import org.eclipse.core.commands.NotHandledException;
import org.eclipse.core.commands.State;
import org.eclipse.core.commands.common.NotDefinedException;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.editparts.ScalableFreeformRootEditPart;
import org.eclipse.gef.editparts.ZoomListener;
import org.eclipse.gef.ui.parts.ScrollingGraphicalViewer;
import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.MouseWheelListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Slider;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.handlers.RegistryToggleState;
import org.eclipse.ui.part.ViewPart;

/**
 * A graphical timeline view with an overview and a detail viewer.
 * 
 * @author <a href="mailto:yvan.lussaud@obeo.fr">Yvan Lussaud</a>
 */
public abstract class AbstractTimelineView extends ViewPart {

	/**
	 * The timeline {@link MouseWheelListener}.
	 * 
	 * @author <a href="mailto:yvan.lussaud@obeo.fr">Yvan Lussaud</a>
	 */
	private final class TimelineMouseWheelListener implements MouseWheelListener {
		@Override
		public void mouseScrolled(MouseEvent e) {
			if ((e.stateMask & SWT.MOD1) != 0) {
				zoom(e);
			} else {
				scroll(e);
			}
		}

		/**
		 * Scrolls according to the given {@link MouseEvent}.
		 * 
		 * @param e
		 *            the {@link MouseEvent}
		 */
		private void scroll(MouseEvent e) {
			final FigureCanvas canvas = (FigureCanvas)timelineViewer.getControl();
			if (canvas.getVerticalBar() != null) {
				int offsetY = canvas.getVerticalBar().getSelection();
				if (e.count > 0) {
					int destinationY = offsetY + 10;
					if (destinationY <= canvas.getVerticalBar().getMinimum()) {
						canvas.scrollTo(0, destinationY);
					}
				} else {
					int destinationY = offsetY - 10;
					if (destinationY >= canvas.getVerticalBar().getMaximum()) {
						canvas.scrollTo(0, destinationY);
					}
				}
			}
		}

		/**
		 * Zooms according to the given {@link MouseEvent}.
		 * 
		 * @param e
		 *            the {@link MouseEvent}
		 */
		private void zoom(MouseEvent e) {
			if (e.count > 0) {
				rootEditPart.getZoomManager().zoomIn();
			} else {
				rootEditPart.getZoomManager().zoomOut();
				final int length = getWindowLength();
				if (provider != null
						&& timelineWindow.getStart() + length > timelineWindow.getMaxTimelineIndex()
								+ nbVirtualChoices
						&& timelineWindow.getMaxTimelineIndex() + nbVirtualChoices - length >= 0) {
					timelineWindow.setStart(timelineWindow.getMaxTimelineIndex() + nbVirtualChoices - length);
				}
			}
		}
	}

	/**
	 * {@link KeyListener} for the timeline viewer.
	 * 
	 * @author <a href="mailto:yvan.lussaud@obeo.fr">Yvan Lussaud</a>
	 */
	private final class TimelineKeyListener implements KeyListener {

		@Override
		public void keyReleased(KeyEvent e) {
			// nothing to do here
		}

		@Override
		public void keyPressed(KeyEvent e) {
			final PossibleStepEditPart toSelect;
			final List<?> selected = timelineViewer.getSelectedEditParts();
			if (selected.size() == 1 && selected.get(0) instanceof PossibleStepEditPart) {
				final PossibleStepEditPart part = (PossibleStepEditPart)selected.get(0);
				switch (e.keyCode) {
					case SWT.ARROW_LEFT:
						// shift the TimelineWindow if needed
						if (timelineWindow.getStart() > part.getModel().getChoice().getIndex() - 1
								&& part.getModel().getChoice().getIndex() - 1 >= 0) {
							if (follow) {
								toggleFollow();
							}
							timelineWindow.setStart(timelineWindow.getStart() - 1);
						}
						toSelect = part.getLeftPossibleStepEditPart();
						break;

					case SWT.ARROW_RIGHT:
						// shift the TimelineWindow if needed
						if (timelineWindow.getEnd() <= part.getModel().getChoice().getIndex() + 1
								&& part.getModel().getChoice().getIndex() + 1 <= timelineWindow
										.getMaxTimelineIndex()
										+ nbVirtualChoices) {
							timelineWindow.setStart(timelineWindow.getStart() + 1);
						}
						toSelect = part.getRightPossibleStepEditPart();
						break;

					case SWT.ARROW_UP:
						toSelect = part.getAbovePossibleStepEditPart();
						break;

					case SWT.ARROW_DOWN:
						toSelect = part.getBeneathPossibleStepEditPart();
						break;

					default:
						toSelect = null;
						break;
				}

				if (toSelect != null) {
					timelineViewer.getSelectionManager().deselectAll();
					timelineViewer.getSelectionManager().appendSelection(toSelect);
					part.getViewer().reveal(toSelect);
				}
			}
		}
	}

	/**
	 * Mouse listener handling the scroll.
	 * 
	 * @author <a href="mailto:yvan.lussaud@obeo.fr">Yvan Lussaud</a>
	 */
	private final class TimelineMouseListener implements MouseListener, MouseMoveListener {

		/**
		 * The position on the mouse down event.
		 */
		private Point originMousePosition;

		/**
		 * The offset of the scroll bars on the mouse down event.
		 */
		private Point offset = new Point();

		/**
		 * The shift applied to the timeline window so far.
		 */
		private int doneShift;

		@Override
		public void mouseDoubleClick(MouseEvent e) {
			// nothing to do here
		}

		@Override
		public void mouseDown(MouseEvent e) {
			if (e.button == 1) {
				originMousePosition = new Point(e.x, e.y);
				final Canvas canevas = (Canvas)timelineViewer.getControl();
				doneShift = 0;
				if (canevas.getVerticalBar() != null) {
					offset.y = canevas.getVerticalBar().getSelection();
				} else {
					offset.y = 0;
				}
			}
		}

		@Override
		public void mouseUp(MouseEvent e) {
			if (e.button == 1) {
				originMousePosition = null;
			}
		}

		@Override
		public void mouseMove(MouseEvent e) {
			if (originMousePosition != null) {
				final FigureCanvas canvas = (FigureCanvas)timelineViewer.getControl();
				canvas.scrollTo(offset.x, offset.y - e.y + originMousePosition.y);
				final int shift = (int)((-e.x + originMousePosition.x)
						/ (PossibleStepEditPart.SIZE + BranchEditPart.SPACING) / rootEditPart
						.getZoomManager().getZoom())
						- doneShift;
				final int multiplier;
				if ((e.stateMask & SWT.MOD1) != 0) {
					multiplier = timelineWindow.getLength();
				} else {
					multiplier = 1;
				}
				if (follow && shift < 0) {
					toggleFollow();
				}
				if (timelineWindow.getStart() + shift * multiplier < 0) {
					timelineWindow.setStart(0);
				} else if (provider != null
						&& timelineWindow.getStart() + timelineWindow.getLength() + shift * multiplier > timelineWindow
								.getMaxTimelineIndex()
								+ nbVirtualChoices) {
					timelineWindow.setStart(Math.max(timelineWindow.getMaxTimelineIndex() + nbVirtualChoices
							- timelineWindow.getLength(), 0));
				} else if (shift != 0) {
					doneShift += shift;
					timelineWindow.setStart(timelineWindow.getStart() + shift * multiplier);
				}
			}
		}
	}

	/**
	 * Lister to the {@link TimelineWindow} and update the slide bar.
	 * 
	 * @author <a href="mailto:yvan.lussaud@obeo.fr">Yvan Lussaud</a>
	 */
	private class TimelineWindowListener extends ITimelineWindowListener.Stub {

		@Override
		public void endChanged(int branch, int end) {
			Display.getDefault().syncExec(new Runnable() {

				@Override
				public void run() {
					if (!timelineSlider.isDisposed()) {
						timelineSlider.setMaximum(timelineWindow.getMaxTimelineIndex() + nbVirtualChoices);
						timelineSlider.setVisible(timelineWindow.getLength() < timelineWindow
								.getMaxTimelineIndex()
								+ nbVirtualChoices);
					}
					if (follow && provider != null) {
						int start = timelineWindow.getMaxTimelineIndex() + nbVirtualChoices
								- timelineWindow.getLength();
						if (start < 0) {
							start = 0;
						}
						timelineWindow.setStart(start);
					}
				}
			});
		}

		@Override
		public void startChanged(final int start) {
			Display.getDefault().syncExec(new Runnable() {

				@Override
				public void run() {
					if (!timelineSlider.isDisposed()) {
						timelineSlider.setSelection(start);
					}
					timelineWindow.setLength(getWindowLength());
				}
			});
		}

		@Override
		public void lengthChanged(final int length) {
			Display.getDefault().syncExec(new Runnable() {

				@Override
				public void run() {
					if (!timelineSlider.isDisposed()) {
						timelineSlider.setPageIncrement(length);
						timelineSlider.setThumb(length);
						if (provider != null) {
							timelineSlider
									.setMaximum(timelineWindow.getMaxTimelineIndex() + nbVirtualChoices);
							timelineSlider.setVisible(timelineWindow.getLength() < timelineWindow
									.getMaxTimelineIndex()
									+ nbVirtualChoices);
						} else {
							timelineSlider.setVisible(false);
						}
					}
					if (follow && provider != null) {
						int start = timelineWindow.getMaxTimelineIndex() + nbVirtualChoices - length;
						if (start >= 0) {
							timelineWindow.setStart(start);
						}
					}
				}
			});
		}
	}

	/**
	 * The ID of this {@link ViewPart}.
	 */
	public static final String ID = "org.eclipse.gemoc.timeline.view";

	/**
	 * The detail view ratio.
	 */
	private static final int DETAIL_RATIO = 10;

	/**
	 * The timeline view ratio.
	 */
	private static final int TIMELINE_RATIO = 90;

	/**
	 * The detail {@link TreeViewer}.
	 */
	private TreeViewer detailViewer;

	/**
	 * The timeline {@link ScrollingGraphicalViewer}.
	 */
	private ScrollingGraphicalViewer timelineViewer;

	/**
	 * The {@link ScalableFreeformRootEditPart}.
	 */
	private ScalableFreeformRootEditPart rootEditPart;

	/**
	 * Timeline {@link Slider}.
	 */
	private Slider timelineSlider;

	/**
	 * The {@link TimelineWindow}.
	 */
	private TimelineWindow timelineWindow;

	/**
	 * The {@link ITimelineProvider}.
	 */
	private ITimelineProvider provider;

	/**
	 * The timeline window listener.
	 */
	private ITimelineWindowListener timelineWindowListener;

	/**
	 * Tells if we should follow the last position or not.
	 */
	private boolean follow;

	/**
	 * The number of virtual choices. virtually mapped in the last choice pixel space.
	 */
	private int nbVirtualChoices;

	/**
	 * The {@link MenuManager}.
	 */
	private MenuManager menuManager;

	@Override
	public void createPartControl(Composite parent) {
		final Composite container;
		if (hasDetailViewer()) {
			final SashForm mainSashForm = new SashForm(parent, SWT.HORIZONTAL);
			container = mainSashForm;
			detailViewer = createDetailViewer(container);
		} else {
			container = parent;
		}
		timelineViewer = new ScrollingGraphicalViewer();
		Composite timelineComposite = new Composite(container, SWT.NONE);
		timelineComposite.setLayout(new FillLayout(SWT.HORIZONTAL | SWT.VERTICAL));
		if (hasDetailViewer()) {
			((SashForm)container).setWeights(new int[] {DETAIL_RATIO, TIMELINE_RATIO, });
		}
		GridLayout layout = new GridLayout(1, false);
		timelineComposite.setLayout(layout);
		timelineViewer.createControl(timelineComposite);

		timelineSlider = new Slider(timelineComposite, SWT.HORIZONTAL);
		GridData gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		timelineSlider.setLayoutData(gridData);
		gridData.grabExcessHorizontalSpace = true;

		rootEditPart = new ScalableFreeformRootEditPart();
		rootEditPart.setViewer(timelineViewer);
		timelineViewer.setRootEditPart(rootEditPart);
		gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		gridData.verticalAlignment = SWT.FILL;
		gridData.grabExcessVerticalSpace = true;
		timelineViewer.getControl().setLayoutData(gridData);
		timelineViewer.setEditPartFactory(getTimelineEditPartFactory());
		timelineWindow = new TimelineWindow(provider);
		timelineViewer.setContents(timelineWindow);
		timelineSlider.setPageIncrement(timelineWindow.getLength());
		timelineSlider.setThumb(timelineWindow.getLength());
		timelineSlider.setSelection(timelineWindow.getStart());
		if (provider != null) {
			timelineSlider.setMaximum(timelineWindow.getMaxTimelineIndex() + nbVirtualChoices);
			timelineSlider.setVisible(timelineWindow.getLength() < timelineWindow.getMaxTimelineIndex()
					+ nbVirtualChoices);
		} else {
			timelineSlider.setVisible(false);
		}
		timelineSlider.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				if (follow) {
					toggleFollow();
				}
				timelineWindow.setStart(timelineSlider.getSelection());
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				if (follow) {
					toggleFollow();
				}
				timelineWindow.setStart(timelineSlider.getSelection());
			}

		});
		timelineWindowListener = new TimelineWindowListener();
		timelineWindow.addTimelineWindowListener(timelineWindowListener);
		if (provider != null) {
			provider.addTimelineListener(timelineWindowListener);
		}
		timelineViewer.getControl().setBackground(ColorConstants.listBackground);
		if (hasDetailViewer()) {
			timelineViewer.addSelectionChangedListener(new ISelectionChangedListener() {

				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					final ISelection selection = event.getSelection();
					if (selection instanceof IStructuredSelection) {
						final Object firstElement = ((IStructuredSelection)selection).getFirstElement();
						if (firstElement instanceof PossibleStepEditPart) {
							final PossibleStepEditPart possibleStepEditPart = (PossibleStepEditPart)firstElement;
							detailViewer.setInput(possibleStepEditPart.getModel().getPossibleStep());
						}
					}
				}
			});
		}
		timelineViewer.getControl().addKeyListener(new TimelineKeyListener());
		final TimelineMouseListener listener = new TimelineMouseListener();
		timelineViewer.getControl().addMouseListener(listener);
		timelineViewer.getControl().addMouseMoveListener(listener);
		timelineViewer.getControl().addMouseWheelListener(new TimelineMouseWheelListener());
		rootEditPart.getZoomManager().addZoomListener(new ZoomListener() {

			@Override
			public void zoomChanged(double zoom) {
				timelineWindow.setLength(getWindowLength());
			}

		});
		timelineViewer.getControl().addControlListener(new ControlListener() {

			@Override
			public void controlResized(ControlEvent e) {
				timelineWindow.setLength(getWindowLength());
				final Canvas canevas = (Canvas)timelineViewer.getControl();
				canevas.getHorizontalBar().setVisible(false);
			}

			@Override
			public void controlMoved(ControlEvent e) {
				// nothing to do here
			}
		});

		final ICommandService cmdService = (ICommandService)getSite().getService(ICommandService.class);
		String commandID = getFollowCommandID();
		if (commandID != null) {
			final Command followCommand = cmdService.getCommand(commandID);
			if (followCommand != null) {
				final State state = followCommand.getState(RegistryToggleState.STATE_ID);
				follow = state != null && ((Boolean)state.getValue()).booleanValue();
			}
		}
		createMenuManager();
	}

	/**
	 * Creates the {@link MenuManager}.
	 */
	private void createMenuManager() {
		menuManager = new MenuManager();
		menuManager.setRemoveAllWhenShown(true);
		menuManager.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager mgr) {
				fillContextMenu(mgr);
			}
		});
		Menu menu = menuManager.createContextMenu(timelineViewer.getControl());
		timelineViewer.getControl().setMenu(menu);
		getSite().registerContextMenu(menuManager, timelineViewer);
		// make the selection available
		getSite().setSelectionProvider(timelineViewer);
	}

	/**
	 * Fills the context menu.
	 * 
	 * @param mgr
	 *            the {@link IMenuManager}
	 */
	private void fillContextMenu(IMenuManager mgr) {
		mgr.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
	}

	/**
	 * Gets the {@link TimelineEditPartFactory}.
	 * 
	 * @return the {@link TimelineEditPartFactory}
	 */
	protected abstract TimelineEditPartFactory getTimelineEditPartFactory();

	/**
	 * Toggle the follow value via the command.
	 */
	private void toggleFollow() {
		final IHandlerService handlerService = (IHandlerService)getSite().getService(IHandlerService.class);
		try {
			final String commandId = getFollowCommandID();
			if (commandId != null) {
				handlerService.executeCommand(commandId, null);
			}
		} catch (ExecutionException e1) {
			Activator.getDefault().getLog().log(
					new Status(Status.ERROR, Activator.PLUGIN_ID, e1.getMessage()));
		} catch (NotDefinedException e1) {
			Activator.getDefault().getLog().log(
					new Status(Status.ERROR, Activator.PLUGIN_ID, e1.getMessage()));
		} catch (NotEnabledException e1) {
			Activator.getDefault().getLog().log(
					new Status(Status.ERROR, Activator.PLUGIN_ID, e1.getMessage()));
		} catch (NotHandledException e1) {
			Activator.getDefault().getLog().log(
					new Status(Status.ERROR, Activator.PLUGIN_ID, e1.getMessage()));
		}
	}

	/**
	 * Gets the timeline viewer.
	 * 
	 * @return the timeline viewer
	 */
	public ScrollingGraphicalViewer getTimelineViewer() {
		return timelineViewer;
	}

	/**
	 * Sets the {@link ITimelineProvider}.
	 * 
	 * @param timelineProvider
	 *            the {@link ITimelineProvider}
	 * @param start
	 *            the new start
	 */
	public void setTimelineProvider(ITimelineProvider timelineProvider, int start) {
		timelineWindow.setProvider(timelineProvider, start);
		if (this.provider != null) {
			this.provider.removeTimelineListener(timelineWindowListener);
		}
		this.provider = timelineProvider;
		if (timelineProvider != null) {
			this.provider.addTimelineListener(timelineWindowListener);
		}
		timelineWindow.setLength(getWindowLength());
	}

	/**
	 * Gets the start point of the displayed timeline.
	 * 
	 * @return the start point of the displayed timeline
	 */
	public int getStart() {
		final int res;

		if (timelineWindow != null) {
			res = timelineWindow.getStart();
		} else {
			res = 0;
		}

		return res;
	}

	/**
	 * Gets the length of the {@link TimelineWindow}.
	 * 
	 * @return the length of the {@link TimelineWindow}
	 */
	@SuppressWarnings("unchecked")
	private int getWindowLength() {
		int length = 0;

		double averageWidth = PossibleStepEditPart.SIZE;
		int lastChoiceWidth = PossibleStepEditPart.SIZE;
		if (provider != null && timelineViewer != null) {
			for (BranchEditPart branchEditPart : (List<BranchEditPart>)timelineViewer.getContents()
					.getChildren()) {
				double[] widthes = computeWidthesForBranch(branchEditPart);
				averageWidth = Math.max(averageWidth, widthes[0]);
				lastChoiceWidth = Math.max(lastChoiceWidth, (int)widthes[1]);
			}
			final double baseWidth = (averageWidth + BranchEditPart.SPACING)
					* rootEditPart.getZoomManager().getZoom();
			if (timelineViewer.getControl().getBounds().width > 2 * BranchEditPart.MARGIN) {
				length = (int)Math
						.floor((timelineViewer.getControl().getBounds().width - 2 * BranchEditPart.MARGIN)
								/ baseWidth);
			} else {
				length = 0;
			}
			if (lastChoiceWidth > PossibleStepEditPart.SIZE) {
				nbVirtualChoices = (int)(Math.floor(lastChoiceWidth * rootEditPart.getZoomManager().getZoom()
						/ baseWidth));
				if (provider != null) {
					timelineSlider.setMaximum(timelineWindow.getMaxTimelineIndex() + nbVirtualChoices);
				}
			}
		}

		return length;
	}

	/**
	 * Computes the average width and the last choice width for the given {@link BranchEditPart}.
	 * 
	 * @param branchEditPart
	 *            the {@link BranchEditPart}
	 * @return the computed average width and last choice width
	 */
	private double[] computeWidthesForBranch(BranchEditPart branchEditPart) {
		double averageWidth = 0;
		int lastChoiceWidth = 0;

		if (branchEditPart.getChildren().size() != 0) {
			Iterator<ChoiceEditPart> it = (Iterator<ChoiceEditPart>)branchEditPart.getChildren().iterator();
			while (it.hasNext()) {
				ChoiceEditPart editPart = it.next();
				if (timelineWindow.getEnd() >= timelineWindow.getMaxTimelineIndex()) {
					if (it.hasNext()) {
						averageWidth += editPart.getFigure().getPreferredSize().width;
					} else {
						lastChoiceWidth = editPart.getFigure().getPreferredSize(Integer.MAX_VALUE,
								Integer.MAX_VALUE).width;
					}
				} else {
					averageWidth += editPart.getFigure().getPreferredSize().width;
				}
			}
			averageWidth /= branchEditPart.getChildren().size();
		} else {
			averageWidth = PossibleStepEditPart.SIZE;
			lastChoiceWidth = PossibleStepEditPart.SIZE;
		}

		return new double[] {averageWidth, lastChoiceWidth };
	}

	/**
	 * Creates the detail {@link TreeViewer}.
	 * 
	 * @param parent
	 *            the parent {@link Composite}
	 * @return the created detail {@link TreeViewer}
	 */
	protected TreeViewer createDetailViewer(Composite parent) {
		final FilteredTree treeViewer = new FilteredTree(parent, SWT.None, createDetailPatternFilter(), false);
		return treeViewer.getViewer();
	}

	/**
	 * Sets the detail view content provider.
	 * 
	 * @param detailContentProvider
	 *            the {@link IContentProvider}
	 */
	public void setDetailViewerContentProvider(IContentProvider detailContentProvider) {
		if (detailViewer != null) {
			detailViewer.setContentProvider(detailContentProvider);
		}
	}

	/**
	 * Sets the detail view label provider.
	 * 
	 * @param detailLabelProvider
	 *            the {@link ILabelProvider}
	 */
	public void setDetailViewerLabelProvider(ILabelProvider detailLabelProvider) {
		if (detailViewer != null) {
			detailViewer.setLabelProvider(detailLabelProvider);
		}
	}

	/**
	 * Creates a {@link PatternFilter} for the detail view.
	 * 
	 * @return the created {@link PatternFilter} for the detail view
	 */
	protected PatternFilter createDetailPatternFilter() {
		PatternFilter res = new PatternFilter();
		return res;
	}

	/**
	 * Gets the detail {@link Viewer}.
	 * 
	 * @return the detail {@link Viewer} if any, <code>null</code> otherwise
	 */
	public Viewer getDetailViewer() {
		return detailViewer;
	}

	@Override
	public void setFocus() {
		if (timelineViewer != null) {
			timelineViewer.getControl().setFocus();
		}
	}

	@Override
	public void dispose() {
		timelineWindow.removeTimelineWindowListener(timelineWindowListener);
		super.dispose();
	}

	/**
	 * Sets the follow last choice value.
	 * 
	 * @param newFollow
	 *            the new follow value
	 */
	public void setFollow(boolean newFollow) {
		this.follow = newFollow;
		if (follow && provider != null && timelineWindow != null) {
			int start = timelineWindow.getMaxTimelineIndex() + nbVirtualChoices - timelineWindow.getLength();
			if (start >= 0) {
				timelineWindow.setStart(start);
			}
		}
	}

	/**
	 * Tells if the {@link AbstractTimelineView#getDetailViewer() detail viewer} exists for this view.
	 * 
	 * @return <code>true</code> if the {@link AbstractTimelineView#getDetailViewer() detail viewer} exists
	 *         for this view, <code>false</code> otherwise
	 */
	public abstract boolean hasDetailViewer();

	/**
	 * Gets the ID of the follow toggle command if any, <code>null</code> otherwise.
	 * 
	 * @return the ID of the follow toggle command if any, <code>null</code> otherwise
	 */
	public abstract String getFollowCommandID();

}
