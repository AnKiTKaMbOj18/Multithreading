class Multi extends Thread implements Runnable{

	@Override
	public void run() {
	System.out.println("thread is running");
		
	}
	
}
public class Test2 {

	public static void main(String[] args) {
		Multi m=new Multi();
		Thread t=new Thread(m);
		m.start();
		t.start();
	}

}
