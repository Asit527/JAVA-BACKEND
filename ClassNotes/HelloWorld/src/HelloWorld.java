
public class HelloWorld {
	int amount = 100;

	public static void main(String[] args) {
		System.out.println(" statrt of main()");
		System.out.println("HELLO WORLD");
		HelloWorld.doSomething();
		System.out.println(" end of main()");

	}

	static void doSomething() {
		System.out.println(" statrt of doSomething()");
		System.out.println("Doing something ");
		HelloWorld h = new HelloWorld();
		h.amount = 230;
		System.out.println(" end doSomething()");

	}
}