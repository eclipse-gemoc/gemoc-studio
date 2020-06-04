package org.eclipse.gemoc.example.k3fsm.mep.server.tests.integration.commands;

import org.eclipse.gemoc.executionframework.mep.services.IModelExecutionProtocolClient;
import org.eclipse.lsp4j.debug.ContinuedEventArguments;
import org.eclipse.lsp4j.debug.ExitedEventArguments;
import org.eclipse.lsp4j.debug.StoppedEventArguments;
import org.eclipse.lsp4j.debug.TerminatedEventArguments;

public class TestClient implements IModelExecutionProtocolClient {
	public enum Status {Unknown, Initialized, Continuing, Stopped, Terminated, Exited}
	public Status currentStatus = Status.Unknown;

	@Override
	public void stopped(StoppedEventArguments args) {
		IModelExecutionProtocolClient.super.stopped(args);
		currentStatus= Status.Stopped;
	}

	@Override
	public void continued(ContinuedEventArguments args) {
		IModelExecutionProtocolClient.super.continued(args);
		currentStatus= Status.Continuing;
	}

	@Override
	public void exited(ExitedEventArguments args) {
		IModelExecutionProtocolClient.super.exited(args);
		currentStatus= Status.Exited;
	}

	@Override
	public void terminated(TerminatedEventArguments args) {
		IModelExecutionProtocolClient.super.terminated(args);
		currentStatus= Status.Terminated;
	}
}
