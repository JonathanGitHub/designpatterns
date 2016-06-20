package com.jonathan.pattern.command;

public class DoorOnCommand implements Command{

	private Door door;
	public DoorOnCommand(Door door){
		this.door = door;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		door.open();
	}

}
