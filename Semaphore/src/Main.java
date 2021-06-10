
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Sempphore can define how many thread will work each otyher for isntance you have a method 
		// and you want to only spesigic number thread will work at the same time.

		SemaphoreTest semaphoreTest = new SemaphoreTest();

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				semaphoreTest.ThreadFonksiyonu(1);

			}
		});
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				semaphoreTest.ThreadFonksiyonu(2);

			}
		});
		Thread thread3 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				semaphoreTest.ThreadFonksiyonu(3);

			}
		});
		Thread thread4 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				semaphoreTest.ThreadFonksiyonu(4);

			}
		});
		Thread thread5 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				semaphoreTest.ThreadFonksiyonu(5);

			}
		});
		Thread thread6 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				semaphoreTest.ThreadFonksiyonu(6);

			}
		});
		Thread thread7 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				semaphoreTest.ThreadFonksiyonu(7);

			}
		});
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();
		thread7.start();
		
		
		
		try {
			thread1.join();
			thread2.join();
			thread3.join();
			thread4.join();
			thread5.join();
			thread6.join();
			thread7.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
