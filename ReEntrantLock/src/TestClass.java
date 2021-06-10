import java.util.concurrent.locks.ReentrantLock;

public class TestClass {

	private int sayi = 0;

	public void arttır1() {

		for (int i = 0; i < 1000; i++) {
			sayi++;

		}
	}

	public void arttır2() {

		for (int i = 0; i < 1000; i++) {
			sayi++;

		}
	}

	public int getSayi() {
		return sayi;
	}

	public void setSayi(int sayi) {
		this.sayi = sayi;
	}
	
	
	

}
