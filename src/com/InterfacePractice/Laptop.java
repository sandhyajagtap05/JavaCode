package com.InterfacePractice;



public class Laptop implements Computer {

	@Override
	public void run() {
		System.out.println("this is in laptop");
		
	}
	
	
	public static void main(String[] args) {
		Computer c=new Desktop();
		
		//c.run();
		
		Computer c1=new Laptop();
		
		//c1.run();
		
		Developer d=new Developer();
		d.devApp(c);
	}

}
