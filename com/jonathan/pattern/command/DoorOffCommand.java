package com.jonathan.pattern.command;

public class DoorOffCommand implements Command{
	private Door door;
	public DoorOffCommand(Door door){
		this.door = door;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		door.close();
	}

}
