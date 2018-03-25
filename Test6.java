
public class Test6 extends Thread{
	public void run(){
		System.out.println("name of running thread is: "+Thread.currentThread().getName());
		System.out.println("priority of running thread is: "+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		Test6 t1=new Test6();
		Test6 t2=new Test6();
		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(MAX_PRIORITY);
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
	}

}
