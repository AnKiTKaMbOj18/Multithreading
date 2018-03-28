class Table2 {
	public void printTable(int n) {
		synchronized (this) {
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
}

public class Test15 {

	public static void main(String[] args) {
		Table2 obj=new Table2();
		
		Thread t1=new Thread(){
			public void run(){
				obj.printTable(4);
			}
		};
		Thread t2=new Thread(){
			public void run(){
				obj.printTable(40);
			}
			};
			t1.start();
			t2.start();
			
	}
}