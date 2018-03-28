class Table3 {
	public void printTable(int n) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Task3 extends Thread {
	Table3 t;

	public Task3(Table3 t){
		this.t=t;
	}

	public void run(){
		t.printTable(5);
	}
}

public class Test16 {

	public static void main(String[] args) {
		Table3 obj=new Table3();
		Task3 t1=new Task3(obj);
		
		t1.start();

	}

}
