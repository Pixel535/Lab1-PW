package Zadanie4;
public class MyThread5 extends Thread{
	
	private Licznik atrybut;

	MyThread5(String nazwa, Licznik atrybut){
		super(nazwa);
		this.atrybut = atrybut;
	}
	
	public void run() {
		for(int i =0; i<5000000; i++) {
			atrybut.inc();
		}
	}
	
	public Licznik get() {
		return atrybut;
	}
	
}
