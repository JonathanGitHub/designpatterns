package com.jonathan.pattern.command;

public class ComputerOnCommand implements Command{

	private Computer computer;
	ComputerOnCommand(Computer computer){
		this.computer = computer;
	}

	public void execute() {
		// TODO Auto-generated method stub
		computer.on();
	}

}
