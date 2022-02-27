package Zadanie3;

public class Test3 {

	public static void main(String[] args) {
		
		Thread w = new MyThread4("Thread4");
		w.start();
		try {
			Thread.sleep(4500);
			w.interrupt();
			w.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Koniec");

	}

}
