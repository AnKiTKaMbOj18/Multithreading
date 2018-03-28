
public class Test extends Thread {
	public void run(){
		System.out.println("shut down  hook task completed");
	}

	public static void main(String[] args) {
		Test t=new Test();
		
		Runtime r=Runtime.getRuntime();
		r.addShutdownHook(t);
		System.out.println("now main sleeping ..pres ctrl+c to exit");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
