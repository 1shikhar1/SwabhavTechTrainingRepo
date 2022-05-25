package com.monocept.model;

public class RemoteControl {
	Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void pressButton() {
		command.execute();
	}
}
