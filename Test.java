package main;

import cpu.CPU;
import hd.HardDisk;
import pc.PC;

public class Test {
	public static void main(String args[]){		
		CPU cpu=new CPU();		
		cpu.setSpeed(2200);	
		cpu.setPrice(3000);
		
		HardDisk disk=new HardDisk();	
		disk.setAmount(200);
		disk.setWeight(26);
		
		
		PC pc=new PC();
		pc.setCPU(cpu);
		pc.setHardDisk(disk);
		pc.show();
	}

}
