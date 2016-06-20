package com.jonathan.pattern.command;

public class ComputerOffCommand implements Command{

	private Computer computer;
	//no private modifier for constructor, unless you wanna do singleton
	ComputerOffCommand(Computer computer){
		this.computer = computer;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		computer.off();
	}

}
