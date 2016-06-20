package com.jonathan.pattern.command;

public class Test {
	public static void main(String[] args){
		Light light = new Light();
		Door door = new Door();
		Computer computer = new Computer();
		
		ControlPanel controlPanel = new ControlPanel();
		controlPanel.setCommand(0, new LightOnCommand(light));
		controlPanel.setCommand(1, new LightOffCommand(light));  
        controlPanel.setCommand(2, new ComputerOnCommand(computer));  
        controlPanel.setCommand(3, new ComputerOffCommand(computer));  
        controlPanel.setCommand(4, new DoorOnCommand(door));  
        controlPanel.setCommand(5, new DoorOffCommand(door)); 
        
        for (int i = 0; i < 9; i++) {
        	controlPanel.keyPressed(i);
        }
        
        
        QuickCommand quickCommand = new QuickCommand(new Command[]{new DoorOffCommand(door),
        		new LightOffCommand(light), new ComputerOnCommand(computer)});
        System.out.println("***Press the quickCommand***");
        controlPanel.setCommand(8, quickCommand);
        controlPanel.keyPressed(8);
	}
}
