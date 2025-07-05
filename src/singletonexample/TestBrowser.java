package singletonexample;

public class TestBrowser {

	public static void main(String[] args) {
//		Browser br = new Browser(); // CE: The constructor Browser() is not visible 
//		[because access specifer is Private]
		
//		Browser br;
//		Browser.getInstance().dispMsg();
		
		Runnable taskRunnable = () ->{
			Browser.getInstance().dispMsg();
		};
		
		Thread thread1 = new Thread(taskRunnable);
		Thread thread2 = new Thread(taskRunnable);
		Thread thread3 = new Thread(taskRunnable);
		Thread thread4 = new Thread(taskRunnable);
		Thread thread5 = new Thread(taskRunnable);
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		
		//wait for all threads to complete
		try {
			thread1.join();
			thread2.join();
			thread3.join();
			thread4.join();
			thread5.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
