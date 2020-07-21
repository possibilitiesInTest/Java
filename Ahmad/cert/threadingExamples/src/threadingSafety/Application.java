package threadingSafety;

public class Application {

	public static void main(String[] args) {

		Sequence sequence = new Sequence();
		
		Worker worker1 = new Worker(sequence);
		worker1.start();
		
		Worker worker2 = new Worker(sequence);
		worker2.start();
		
		for(int i = 0; i < 100; i++) {
			System.out.println(sequence.getNext());
		}
	}
}


class Worker extends Thread {
	Sequence sequence = null;
	
	public Worker(Sequence sequence) {
		this.sequence = sequence;
	}
	
	public void run() {
		for(int i=0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " got value: " + sequence);
		}
	}
}