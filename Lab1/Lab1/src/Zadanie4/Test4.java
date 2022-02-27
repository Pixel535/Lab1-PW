package Zadanie4;
public class Test4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MyThread5[] w = new MyThread5[10];
		
		Licznik atrybut = new Licznik();
		
		for(int i = 0; i< w.length; i++) {
			w[i] = new MyThread5("" + i, atrybut);
		}
		
		for(int i = 0; i < w.length; i++) {
			w[i].start();
		}
		for(int i = 0; i < w.length; i++) {
			w[i].join();
		}
		System.out.println("Stan licznika = " + atrybut.get());
	}

}
