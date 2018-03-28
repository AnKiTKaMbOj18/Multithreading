class Table {
	public void printTable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n * i);

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Mythread1 extends Thread {
	Table t;

	public Mythread1(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}
}

class Mythread2 extends Thread {
	Table t;

	public Mythread2(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(50);
	}

}

public class Test13 {
	public static void main(String[] args) {
		Table obj = new Table();
		Mythread1 t1 = new Mythread1(obj);
		Mythread2 t2 = new Mythread2(obj);

		t1.start();
		t2.start();

	}

}
