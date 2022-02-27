package Zadanie1;
public class MyThread1 extends Thread{

	public MyThread1(String nazwa){
		super(nazwa);
	}
	
	public void run() {
		
		for(int i = 0; i<10;i++) {
			System.out.println("Pozdrowienia z watku " + Thread.currentThread().getName());
		}
		
	}
}