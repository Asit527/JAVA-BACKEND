package com.kodewala.markerinf;
interface Compressible{}
interface Encryptable{}
class SecureArchive implements Compressible,Encryptable{
	
}
public class Processor {
	static void process(Object o){
		if(o instanceof Compressible && o instanceof Encryptable)
			System.out.println("Compressed & Encrypted");
		else if(o instanceof Compressible)
			System.out.println("Compressed");
		else if(o instanceof Encryptable)
			System.out.println("Encrypted");
		else
			System.out.println("reject");
	}
	public static void main(String[] args) {
		Processor.process(new SecureArchive() );
		
	}

}

//
//🔟 Modern replacement thought experiment
//Rewrite marker design using behavior instead.
//Replace marker:
//Schedulable
//With method:
//interface Schedulable {
//    void schedule();
//}
//Compare both designs in usage code.
//This forces the key insight:
//marker vs capability interface.