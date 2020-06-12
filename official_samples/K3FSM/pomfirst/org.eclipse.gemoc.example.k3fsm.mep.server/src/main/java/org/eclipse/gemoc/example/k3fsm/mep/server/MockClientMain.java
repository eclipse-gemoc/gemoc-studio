package org.eclipse.gemoc.example.k3fsm.mep.server;


import org.eclipse.gemoc.executionframework.mep.launch.MEPServerLSP4J;
import org.eclipse.gemoc.executionframework.mep.services.IModelExecutionProtocolClient;

import org.eclipse.lsp4j.debug.BreakpointEventArguments;
import org.eclipse.lsp4j.debug.CapabilitiesEventArguments;
import org.eclipse.lsp4j.debug.ContinuedEventArguments;
import org.eclipse.lsp4j.debug.ExitedEventArguments;
import org.eclipse.lsp4j.debug.InitializeRequestArguments;
import org.eclipse.lsp4j.debug.LoadedSourceEventArguments;
import org.eclipse.lsp4j.debug.ModuleEventArguments;
import org.eclipse.lsp4j.debug.OutputEventArguments;
import org.eclipse.lsp4j.debug.ProcessEventArguments;
import org.eclipse.lsp4j.debug.StoppedEventArguments;
import org.eclipse.lsp4j.debug.TerminatedEventArguments;
import org.eclipse.lsp4j.debug.ThreadEventArguments;



public class MockClientMain {
	
	public static void main(String[] args) {
		try {
			MEPServerLSP4J server = new K3FSMMEPModule().createInjectorAndDoEMFRegistration().getInstance(MEPServerLSP4J.class);
			
//			new LogoIdeSetup().createInjectorAndDoEMFRegistration();
//			ASMPackage rootPkg = ASMPackage.eINSTANCE;
//			ResourceSet rs = new ResourceSetImpl();
//			Resource res = rs.getResource(URI.createURI("/home/fcoulon/tree.logo"),true);
//			System.out.println(res.getContents().get(0));
//			
//			XtextResource xRes = (XtextResource) res;
//			Iterable<INode> it = xRes.getParseResult().getSyntaxErrors();
//			it.iterator().forEachRemaining(node -> {
//				System.out.println(node.getSyntaxErrorMessage());
//			});
			
			
			IModelExecutionProtocolClient mockClient = new IModelExecutionProtocolClient() {

				@Override
				public void initialized() {
					// TODO Auto-generated method stub
					IModelExecutionProtocolClient.super.initialized();
				}

				@Override
				public void stopped(StoppedEventArguments args) {
					// TODO Auto-generated method stub
					IModelExecutionProtocolClient.super.stopped(args);
				}

				@Override
				public void continued(ContinuedEventArguments args) {
					// TODO Auto-generated method stub
					IModelExecutionProtocolClient.super.continued(args);
				}

				@Override
				public void exited(ExitedEventArguments args) {
					// TODO Auto-generated method stub
					IModelExecutionProtocolClient.super.exited(args);
				}

				@Override
				public void terminated(TerminatedEventArguments args) {
					// TODO Auto-generated method stub
					IModelExecutionProtocolClient.super.terminated(args);
				}

				@Override
				public void thread(ThreadEventArguments args) {
					// TODO Auto-generated method stub
					IModelExecutionProtocolClient.super.thread(args);
				}

				@Override
				public void output(OutputEventArguments args) {
					// TODO Auto-generated method stub
					IModelExecutionProtocolClient.super.output(args);
				}

				@Override
				public void breakpoint(BreakpointEventArguments args) {
					// TODO Auto-generated method stub
					IModelExecutionProtocolClient.super.breakpoint(args);
				}

				@Override
				public void module(ModuleEventArguments args) {
					// TODO Auto-generated method stub
					IModelExecutionProtocolClient.super.module(args);
				}

				@Override
				public void loadedSource(LoadedSourceEventArguments args) {
					// TODO Auto-generated method stub
					IModelExecutionProtocolClient.super.loadedSource(args);
				}

				@Override
				public void process(ProcessEventArguments args) {
					// TODO Auto-generated method stub
					IModelExecutionProtocolClient.super.process(args);
				}

				@Override
				public void capabilities(CapabilitiesEventArguments args) {
					// TODO Auto-generated method stub
					IModelExecutionProtocolClient.super.capabilities(args);
				}

				
				
			};

			server.connect(mockClient);

			InitializeRequestArguments initParam = new InitializeRequestArguments();
			server.initialize(initParam);
			
			/*DidOpenTextDocumentParams openParam = new DidOpenTextDocumentParams(
					new TextDocumentItem("/home/fcoulon/tree.logo", "logo", 1, "LogoProgram {\n" + 
							"	Proc Square(size) {\n" + 
							"		PenDown;\n" + 
							"		Repeat 4.0 {\n" + 
							"			Forward size;\n" + 
							"			Left 90.0\n" + 
							"		};\n" + 
							"		PenUp\n" + 
							"	};\n" + 
							"\n" + 
							"	Proc Tree(baseSize, depth, direction) {\n" + 
							"\n" + 
							"		Proc SubSquareSize(size, angle) {\n" + 
							"			Return size * Cos angle\n" + 
							"		};\n" + 
							"\n" + 
							"		Left 90.0;\n" + 
							"		Forward baseSize;\n" + 
							"		Right 45.0 - direction;\n" + 
							"		Square(SubSquareSize(baseSize, 45.0 + direction));\n" + 
							"		If depth > 0.0 {\n" + 
							"			Tree(SubSquareSize(baseSize, 45.0 + direction), depth - 1.0, 0.0)\n" + 
							"		};\n" + 
							"		Right 45.0 + direction;\n" + 
							"		Forward baseSize;\n" + 
							"		Right 45.0 - direction;\n" + 
							"		Back baseSize;\n" + 
							"		Square(SubSquareSize(baseSize, 45.0 - direction));\n" + 
							"		If depth > 0.0 {\n" + 
							"			Tree(SubSquareSize(baseSize, 45.0 - direction), depth - 1.0, 0.0)\n" + 
							"		};\n" + 
							"		Forward SubSquareSize(baseSize, 45.0 - direction);\n" + 
							"		Left 45.0 - direction;\n" + 
							"		Back baseSize;\n" + 
							"		Left 90.0;\n" + 
							"		Back baseSize;\n" + 
							"		Right 90.0\n" + 
							"	};\n" + 
							"\n" + 
							"	Square(150.0);\n" + 
							"	Tree(150.0, 8.0, 5.0)\n" + 
							"}\n" + 
							""));
			server.didOpen(openParam);
			*/
			
			
			synchronized (server) {
				server.wait();
			}


//			RenameParams param = new RenameParams(new TextDocumentIdentifier("/home/fcoulon/tree.logo"), new Position(1,9), "foobar");
//			CompletableFuture<WorkspaceEdit> reply = server.rename(param);
//			System.out.println(reply.get());
//			
//			ReferenceParams refParam = new ReferenceParams(new ReferenceContext());
//			refParam.setTextDocument(new TextDocumentIdentifier("/home/fcoulon/tree.logo"));
//			refParam.setPosition(new Position(1,9));
//			CompletableFuture<List<? extends Location>> replyRef = server.references(refParam);
//			System.out.println(replyRef.get());
			
//			DocumentFormattingParams formatParam = new DocumentFormattingParams(new TextDocumentIdentifier("/home/fcoulon/tree.logo"), new FormattingOptions());
//			CompletableFuture<List<? extends TextEdit>> replyFormat = server.formatting(formatParam);
//			System.out.println(replyFormat.get());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("DONE");
	}

}
