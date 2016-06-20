package com.jonathan.pattern.command;

public class ControlPanel {
	private static final int CONTROL_SIZE = 9;
	private Command[] commands;
	
	public ControlPanel(){
		commands = new Command[CONTROL_SIZE];
		for (int i = 0; i < CONTROL_SIZE; i++){
			commands[i] = new NoCommand();
		}
	}
	
	public void setCommand(int index, Command command){
		commands[index] = command;
	}
	
	public void keyPressed(int index){
		commands[index].execute();
	}
}
