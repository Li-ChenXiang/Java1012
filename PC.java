package pc;

import cpu.CPU;
import hd.HardDisk;

public class PC {
	CPU cpu;
	HardDisk HD;
	public void setCPU(CPU c){
		this.cpu=c;
	}
	public void setHardDisk(HardDisk h){
		this.HD=h;
	}
	public void show(){
		System.out.println("CPU�ٶ�"+cpu.getSpeed());
		System.out.println("CPU��Ǯ"+cpu.getPrice());
		System.out.println("Ӳ������"+HD.getAmount());		
		System.out.println("Ӳ�̺��"+HD.getWeight());
	}

}
