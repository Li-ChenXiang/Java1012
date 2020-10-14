package pc;

import cpu.CPU;
import hd.HardDisk;

public class PC {
	CPU cpu;
	HardDisk HD;
	PC(){
	}
	public void setCPU(CPU c){
		this.cpu=c;
	}
	public void setHardDisk(HardDisk h){
		this.HD=h;
	}
	public void show(){
		System.out.println("CPU速度"+cpu.getSpeed());
		System.out.println("CPU价钱"+cpu.getPrice());
		System.out.println("硬盘容量"+HD.getAmount());		
		System.out.println("硬盘厚度"+HD.getWeight());
	}

}
