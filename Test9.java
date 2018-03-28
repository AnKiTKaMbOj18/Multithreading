
public class Test9 implements Runnable {

	public void run() {
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Test9 t = new Test9();
		ThreadGroup tg = new ThreadGroup("Thread_group");

		Thread t1 = new Thread(tg, t, "one");

		Thread t2 = new Thread(tg, t, "two");

		Thread t3 = new Thread(tg, t, "three");

		t1.start();
		t2.start();
		t3.start();

		System.out.println("Thread Group Name: " + tg.getName());

		tg.list();
	}
}
