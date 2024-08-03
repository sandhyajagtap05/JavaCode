package com.HumanCloud;

public enum Status {
	
	running,pending,success,notfound;

	
	public static void main(String[] args) {
		
//		Status s=Status.pending;
//		
//		int a=s.ordinal();
//		
//		System.out.println(a);
		
		Status s[]=Status.values();
		
//		for(int i=0;i<s.length;i++) {
//			System.out.println(s[i]+" "+s[i].ordinal());
//		}
		
		
		for(Status a:s) {
			System.out.println(a+" "+a.ordinal());
			
		}
	}
	
	
}

