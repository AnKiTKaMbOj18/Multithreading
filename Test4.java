
public class Test4 extends Thread {
	public void run(){
		for(int i=1;i<=5;i++){
			try{Thread.sleep(500);}catch(Exception e){}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Test4 t1=new Test4();
		Test4 t2=new Test4();
		Test4 t3=new Test4();
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		t3.start();
	}

}
