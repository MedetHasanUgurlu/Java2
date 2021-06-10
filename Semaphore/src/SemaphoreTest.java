import java.util.concurrent.Semaphore;

public class SemaphoreTest {
	Semaphore semaphore = new Semaphore(2);
	
	public void ThreadFonksiyonu(int id) {
		try {
			semaphore.acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread basliyor. ID: "+id );
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread cikiyor. ID: "+id);
		semaphore.release();
		
		
		
	}
	

}
