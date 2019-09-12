package learn_java.doExc;

public class MethodReference {

	public static void main(String[] args) {		
		Thread t =new Thread(MethodReference :: goProcess);   //MethodReference :: goProcess=== ()->goProcess()
		t.start();

	}
	
	public static void goProcess() {
		System.out.println("Hey ! I'm doing my Job.............");
	}

}
