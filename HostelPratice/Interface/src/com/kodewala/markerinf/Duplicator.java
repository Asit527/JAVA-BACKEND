package com.kodewala.markerinf;
interface Duplicable{}
class Blueprint implements Duplicable{
	String blueprintType;
	Blueprint(String blueprintType){
		super();
		this.blueprintType=blueprintType;
	}
}//not sensitive blueprint so allowed
public class Duplicator {

	static Object duplicate(Object o){
		if(o instanceof Duplicable ) {
			Blueprint b =(Blueprint) o;
		 return new Blueprint(b.blueprintType);}// imp line
		// return new Blueprint("House1");}// imp line
		else
			return null ;
	}
	public static void main(String[] args) {
		Blueprint obj1 = new  Blueprint("House");
		System.out.println(obj1.blueprintType);
		Blueprint obj2 =(Blueprint)Duplicator.duplicate(obj1);
		System.out.println(obj2.blueprintType);
	}

}
