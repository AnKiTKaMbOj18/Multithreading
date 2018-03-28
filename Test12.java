
public class Test12 extends Thread {

	public void startThread() {
		start();
	}

	public void run() {
		for (int i = 0; i <= 10; ++i) {
			System.out.println("Child Thread: " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Test12 t = new Test12();

		t.startThread();
		
		for (int i = 0; i <= 10; ++i) {
			System.out.println("Parent Thread: " + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}

		}

	}

}
