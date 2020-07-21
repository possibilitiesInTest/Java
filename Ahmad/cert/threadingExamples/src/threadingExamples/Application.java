package threadingExamples;

public class Application {

	public static void main(String[] args) {
		
		// first thread
		System.out.println("Starting Thread 1");
//		Task taskRunner = new Task("Thread-A");
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i =0; i < 1000; i++) {
					System.out.println("number: "+ i + Thread.currentThread().getName());
					
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});

//		taskRunner.start();
//		taskRunner.run();
		t1.start();
		
		
		// second thread
		System.out.println("Starting Thread 2");
//		Task taskRunner2 = new Task("Thread-B");
		Thread t2 = new Thread(new Runnable() {
			

			@Override
			public void run() {
				for (int i =0; i < 1000; i++) {
					System.out.println("number: "+ i + Thread.currentThread().getName());
					
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
//		taskRunner2.start();
//		taskRunner2.run();
		t2.start();

	}

}


//class Task extends Thread {
class Task implements Runnable {
	
	String name;

	public Task(String name) {
		this.name = name;
	}
	
	public void run() {
		Thread.currentThread().setName(this.name);
		for (int i =0; i < 1000; i++) {
			System.out.println("number: "+ i + Thread.currentThread().getName());
			

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
