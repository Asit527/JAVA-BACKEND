package com.kodewala.threads4;

public class Task {
public static  void printEven() {
	System.out.println("Even Start");
	for(int i=0;i<10;i++) {
		synchronized (Task.class) { // using synchronized block
							 // reduce the exicution time
			if(i%2==0) {
				System.out.println(i+" : print by "+Thread.currentThread().getName());
			}
		}

	}
	System.out.println("Even End");
}

public static  void printOdd() {
	System.out.println("Odd Start");

		for(int i=0;i<10;i++) {
			synchronized (Task.class) {    // using synchronized block
									// reduce the exicution time
				if(i%2!=0) {
					System.out.println(i+" : print by "+Thread.currentThread().getName());

		}

			}


}
	System.out.println("Odd End");
}}
