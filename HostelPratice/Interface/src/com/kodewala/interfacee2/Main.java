package com.kodewala.interfacee2;

public class Main extends FileStorage implements Logger, Shape, Vehicle, Payment, User, MathUtils, StringUtils {

	private String name;

	// constructor
	Main(String name) {
		super();
		this.name = name;
	}

	// default constructor
	Main() {
		super();

	}

	// Q1
	@Override
	public void log(String msg) {
		System.out.println("log()");
	}

	// Q2
	@Override
	public int area() {
		return 20;
	}

	@Override
	public void printArea() {
		System.out.println("Area = " + area());
	}

	// Q3
	@Override
	public void start() {
		System.out.println("Engine started");
	}

	@Override
	public void stop() { // not mandatory
		System.out.println("Engine Stopped");
	}

	// Q4

	@Override
	public void pay(double amount) {
		System.out.println(amount);
	}

	@Override
	public boolean validateAmount(double amount) {
		boolean b = false;
		if (amount > 0) {
			b = true;
		}
		return b;
	}

	// Q5

	@Override
	public void getName() {
		System.out.println("Enter Name");
	}

	@Override
	public void greet() {
		System.out.println("Hello " + name);
	}

	// Q6

	// Q7

	// Q8

	// Q9

	// Q10

//	Now backward compatibility scenarios.
//	did outside(all)
	// Q11

	// Q12

	// Q13

	// Q14

	// Q15

	// Q16

	// Q17

	// Q18

	// Q19

	// Q20

	// main method
	public static void main(String[] args) {

		// Q1

//		Main obj1 = new Main();
//		obj1.log(null);
//		obj1.logInfo(null);

		// Q2

//		Shape obj2 = new Main();
//		obj2.printArea();

		// Q3

//		Vehicle obj3 = new Main();
//		obj3.start();
//		obj3.stop();

		// Q4

//		Payment obj4 = new Main();
//		obj4.pay(1000);
//		System.out.println(obj4.validateAmount(1));

		// Q5
//
//		User obj5 = new Main("Asit");
//		
//		obj5.getName();
//		obj5.greet();

//		Now static methods to remove duplication.

		// Q6

		// no need to call through object call through class name because its static

//		System.out.println(MathUtils.add(1, 2));

		// Q7

//		StringUtils.isNullOrEmpty("");

		// Q8
//		System.out.println(Logger2.format("1"," Asit"));

		// Q9
//		DateUtils.currentYear();

		// Q10
//		System.out.println("is mail have @: "+ Validator.isEmail("Nayak@"));

		// Q20

//		FileStorage obj20= new  FileStorage();
//		obj20.save("Saving...");

	}

}
