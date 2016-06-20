package com.jonathan.pattern.command;

public class QuickCommand implements Command{

	private Command[] commands;
	public QuickCommand(Command[] commands){
		this.commands = commands;
	}
	public void execute() {
		// TODO Auto-generated method stub
		for(int i = 0; i < commands.length; i++) {
			commands[i].execute();
		}
	}

}
