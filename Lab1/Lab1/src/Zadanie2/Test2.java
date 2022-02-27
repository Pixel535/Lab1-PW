package Zadanie2;
public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		
		Thread[] w = new Thread[10];
		
		for(int i = 0; i<10; i++) {
			MyThread2 t = new MyThread2();
			w[i] = new Thread(t, "" + i);
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
