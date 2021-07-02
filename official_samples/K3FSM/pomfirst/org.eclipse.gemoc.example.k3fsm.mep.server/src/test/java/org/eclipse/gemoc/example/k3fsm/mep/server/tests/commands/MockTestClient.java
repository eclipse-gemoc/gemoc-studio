package org.eclipse.gemoc.example.k3fsm.mep.server.tests.commands;

import org.eclipse.gemoc.executionframework.mep.services.IModelExecutionProtocolClient;
import org.eclipse.lsp4j.debug.BreakpointEventArguments;
import org.eclipse.lsp4j.debug.CapabilitiesEventArguments;
import org.eclipse.lsp4j.debug.ContinuedEventArguments;
import org.eclipse.lsp4j.debug.ExitedEventArguments;
import org.eclipse.lsp4j.debug.LoadedSourceEventArguments;
import org.eclipse.lsp4j.debug.ModuleEventArguments;
import org.eclipse.lsp4j.debug.OutputEventArguments;
import org.eclipse.lsp4j.debug.ProcessEventArguments;
import org.eclipse.lsp4j.debug.StoppedEventArguments;
import org.eclipse.lsp4j.debug.TerminatedEventArguments;
import org.eclipse.lsp4j.debug.ThreadEventArguments;

public class MockTestClient implements IModelExecutionProtocolClient {
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

}
