//Declare a local variable inside an if block and try to access it outside the block.
class Q4{
	public static void main(String[]args){
	if(true){
	int i;
	}
	System.out.println(i);
	}
}