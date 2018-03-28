class Table4 {
	synchronized static void printTable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class OneThread extends Thread {

	public void run() {
		Table4.printTable(5);
	}
}

class TwoThread extends Thread {

	public void run() {
		Table4.printTable(10);
	}
}

class ThreeThread extends Thread {

	public void run() {
		Table4.printTable(15);
	}
}

class FourThread extends Thread {

	public void run() {
		Table4.printTable(20);
	}
}

public class Test17 {

	public static void main(String[] args) {
		OneThread t1 = new OneThread();
		TwoThread t2 = new TwoThread();
		ThreeThread t3 = new ThreeThread();
		FourThread t4 = new FourThread();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		}

}
