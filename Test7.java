
public class Test7 extends Thread {
	public void run(){
		if(Thread.currentThread().isDaemon()){
		System.out.println("daemon thread working");
		}
		else
			System.out.println("user thread working");
	}

	public static void main(String[] args) {
		Test7 t1=new Test7();
		Test7 t2=new Test7();
		
		t1.setDaemon(true);
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
	
	}

}
