package com.loner.pattern.command;

public class CommandImpl extends Command {

	public CommandImpl(Receiver receiver) {
		super(receiver);
	}

	public void execute() {
		receiver.receive();
	}

}
