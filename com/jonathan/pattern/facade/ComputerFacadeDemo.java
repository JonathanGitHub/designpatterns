//the components of a computer
//src： http://www.programcreek.com/2013/02/java-design-pattern-facade/
/*
 * Facade design pattern hides complexity of a task and provides a simple interface. 
 * A very good example is the startup of a computer. When a computer starts up, 
 * it involves the work of cpu, memory, hard drive, etc. To make it easy to use for users,
 * we can add a facade which wrap the complexity of the task, and provide one simple interface instead.
*/
class CPU {
    public void processData() { }
}
 
class Memory {
    public void load() { }
}
 
class HardDrive {
    public void readdata() { }
}
 
/* Facade */
class Computer {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;
 
    public Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }
 
    public void run() {
        cpu.processData();
        memory.load();
        hardDrive.readdata();
    }
}
 
 
class User {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.run();
    }
}