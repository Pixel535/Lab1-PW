package Zadanie1;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		
		Thread[] w = new Thread[10];
		
		for(int i = 0; i< w.length; i++) {
			w[i] = new MyThread1("" + i);
		}
		
		for(int i = 0; i < w.length; i++) {
			w[i].start();
		}
		
		for(int i = 0; i < w.length; i++) {
			w[i].join();
		}
		
		System.out.println("Koniec");

	}

}