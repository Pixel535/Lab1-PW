package Zadanie3;

public class MyThread3 extends Thread {

	MyThread3(String nazwa){
		super(nazwa);
	}
	
	public void run() {
		for(int i =0; i<10; i++) {
		try {
				Thread.sleep(1000);
				System.out.println("Spalem przez 1 sekunde " + Thread.currentThread().getName());
			} catch(InterruptedException e) {
				System.out.println("Zostalem obudzony - " + Thread.currentThread().getName());
				break;
			}
		}
	}
	
	
	
}
