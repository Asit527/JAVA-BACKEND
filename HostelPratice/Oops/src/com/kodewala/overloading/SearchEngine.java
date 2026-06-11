package com.kodewala.overloading;

public class SearchEngine {
 //v1
	void find(int id) {
	 System.out.println("v1");
 }
	//v2
void find(String name) {
	 System.out.println("v2"); 
	
 }
//v3
void find(String catagory,double price) {
	 System.out.println("v3");
}
	public static void main(String[] args) {
		SearchEngine obj1 = new SearchEngine();
		obj1.find(1);
		obj1.find("Iphone");
		obj1.find("Phone",10000);

	}

}
