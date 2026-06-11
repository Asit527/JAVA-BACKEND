package com.kodewala.encapsulation1;

public class Book {
	private int pages=10;
	public void  setPage(int pages) {
		if(pages>0) {
			this.pages=pages;
			
		}
		
	}
	public static void main(String[] args) {
		Book obj1= new Book();
		obj1.setPage(-18);
		System.out.println(obj1.pages);
		obj1.setPage(18);
		System.out.println(obj1.pages);
	}

}
