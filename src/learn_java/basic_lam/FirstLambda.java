package learn_java.basic_lam;

public class FirstLambda {

	public void myFirst() {
		System.out.println("Hey !, this is my traditional way implementation......");
	}

	public static void main(String[] args) {
		
		
		FirstLambda firstLambda =new FirstLambda();
		firstLambda.myFirst();
		
		DefineMyLambda myLambda = () -> System.out.println("Hey !, this is my new way implementaiton.......");

		DefineMyAddLambda addFunction = (int x, int y) -> x + y;
		
		myLambda.myMethod();		
		
		System.out.println("The total is......."+addFunction.myAddMethod(10, 15));
	}

}



// Must have only one method. 
// There might be chance some one can add other method, so your code will fail. to avoid this use functional interface annotation.
@FunctionalInterface
interface DefineMyLambda {
	public void myMethod();

}

@FunctionalInterface
interface DefineMyAddLambda {
	public int myAddMethod(int x, int y);
}
