
public class MyThread implements Runnable {
	
	private String t_name;
	private Thread t;
	
	public MyThread(String t_name) {
		this.t_name = t_name;
		this.t = new Thread(this, this.t_name);
		System.out.println("New Thread: " + this.t);
		this.t.start();
	}
	
	@Override
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				Thread.sleep(500);
				System.out.println("Thread " + this.t_name + ": " + i);
			}
		} catch (InterruptedException iEx) {
			System.out.println(iEx);
		}
		System.out.println("Thread " + this.t_name + " Exiting");
	}

	public static void main(String[] args) {
		MyThread t1 = new MyThread("One");
		MyThread t2 = new MyThread("Two");
		MyThread t3 = new MyThread("Three");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException iEx) {
			System.out.println(iEx);
		}
		System.out.println("Main Exiting");
	}

}
