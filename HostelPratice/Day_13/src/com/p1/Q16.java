package com.p1;

public class Q16 {
	String items[];
	 Q16(String []items){
		this.items=items;
	}
	

	public static void main(String[] args) {
		int totalItems= args.length;
		Q16 obj1 = new Q16(args);
		
		for(int i =0;i<totalItems;i++) {
		
			System.out.println(obj1.items[i]);
			
		
		}
		

	}

}
