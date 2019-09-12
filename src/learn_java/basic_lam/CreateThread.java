package learn_java.basic_lam;

public class CreateThread {

	public static void main(String[] args) {

		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {

				System.out.println("The Runnable method");

			}
		});

		thread.run();

		Thread lambdathread = new Thread(() -> System.out.println("The Lambda Runnable method"));
		lambdathread.run();
	}

}
