package com.multithreding;

public class UsingLambdaExpression  {
	
	public static void main(String[] args) {
		
	 Runnable r1=()-> {
				for(int i=0;i<9;i++) {
					System.out.println("hii");
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			
		};
		
		Runnable r=()->{
			
			for(int i=0;i<6;i++) {
			System.out.println("Hello");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	};
		Thread t=new Thread(r);
		Thread t1=new Thread(r1);
		t.start();
        t1.start();
		
		
		
	}

	

	

}
