package Zadanie2;
public class MyThread2 implements Runnable{

	public void run() {
		for(int i=0; i<10;i++) {
			System.out.println("Pozdrowienia z watku " + Thread.currentThread().getName());
		}
		
	}
	
}
