package day11;

public class Q17 {
	int x = 5;
    void change() {
        x = 20;
    }

	public static void main(String[] args) {
		Q17 t = new Q17();
	    t.change();
	    System.out.println(t.x);

	}

}
