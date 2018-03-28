
class Table1 {
	synchronized void printTable(int n) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("error");
			}
		}
	}
}

class Task1 extends Thread {
	Table1 t;

	public Task1(Table1 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}
}

class Task2 extends Thread {
	Table1 t;

	public Task2(Table1 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}

public class Test14 {
	public static void main(String[] args) {
		Table1 obj = new Table1();
		Task1 t1 = new Task1(obj);
		Task2 t2 = new Task2(obj);
		t1.start();

		t2.start();

	}

}
