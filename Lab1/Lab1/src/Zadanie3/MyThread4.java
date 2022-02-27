package Zadanie3;

public class MyThread4 extends Thread{

	MyThread4(String nazwa){
		super(nazwa);
	}
	
	public void run() {
		Thread w = new MyThread3("Thread3");
		w.start();
		for(int i =0; i<5; i++) {
			try {
					Thread.sleep(2000);
					System.out.println("Spalem przez 2 sekundy " + Thread.currentThread().getName());
				} catch(InterruptedException e) {
					System.out.println("Zostalem obudzony - " + Thread.currentThread().getName());
					w.interrupt();
					try {
						w.join();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					break;
				}
			}
		
	}
	
}
