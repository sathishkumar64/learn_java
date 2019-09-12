package learn_java.basic_lam;

public class TypeInferExmp {

	public static void main(String[] args) {		
		//FindStringLengthLambda myLambda = s -> s.length();		
		//System.out.println(myLambda.getLength("Dey I'm counting your length...."));
		
		throughFunction(s -> s.length());
	}
	
	
	public static void throughFunction(FindStringLengthLambda f) {
		System.out.println(f.getLength("Dey I'm counting your length...."));
	}

	interface FindStringLengthLambda{ 	
		int getLength(String s);
	}
}


