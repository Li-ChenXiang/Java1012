# 计G202 2020322088 李晨香

# Java1012

## 一、实验目的
1.理解类和对象的区别，掌握构造函数的使用；

2.熟悉通过对象名引用实例的方法和属性，进一步掌握方法调用时参数的传递。

## 二、实验过程
1.创建Java项目Computer;

2.创建CPU类，HardDisk类，PC类以及主类Test类，将四个类分别放在cpu包，hd包，pc包及main包；

3.在CPU类中添加getSpeed()返回speed的值，添加setSpeed(int m)方法将参数m的值赋值给speed；

4.在HardDisk类中添加getAmount()返回amount的值，添加setAmount(int m)方法将参数m的值赋值给amount;

5.在PC类中添加setCPU(CPU c)将参数c的值赋值给cpu，添加setHardDisk(HardDisk h)方法将参数h的值赋值给HD；

6.添加show()方法能显示cpu的速度和字节及硬盘的容量和质量；  

7.在主类Test的main方法中创建一个CPU对象cpu，将cpu自己的speed设置为2200；创建一个HardDisk对象disk，将disk自己的amount设置为200；创建一个PC对象pc；

8.在主类Test的main方法中用pc调用setCPU(CPU c)方法，调用实参是cpu;调用setHardDisk(HardDisk h)方法，调用时实参是disk；调用show()方法。

## 三、核心方法
1.方法一
```
public void setSpeed(int m){
		this.speed=m;
	}
```

2.方法一
```
public void setPrice(float p){
		this.price=p;
	}
```

3.方法一
```
public void setAmount(int m){
		this.amount=m;
	}
```

4.方法一
```
public void setWeight(float w){
		this.weight=w;
	}
```

5.方法一
```
public void setCPU(CPU c){
		this.cpu=c;
	}
```

6.方法一
```
public void setHardDisk(HardDisk h){
		this.HD=h;
	}
```

7.方法一
```
public void show(){
		System.out.println("CPU速度"+cpu.getSpeed());
		System.out.println("CPU价钱"+cpu.getPrice());
		System.out.println("硬盘容量"+HD.getAmount());		
		System.out.println("硬盘厚度"+HD.getWeight());
	}
```

## 四、实验结果
```
CPU速度2200
CPU价钱3000.0
硬盘容量200
硬盘厚度26.0
```

## 五、实验感想
通过本次实验，让我了解了构造方法的使用，掌握了方法调用时参数的传递，经过老师和同学的帮助顺利的完成了本次实验。
