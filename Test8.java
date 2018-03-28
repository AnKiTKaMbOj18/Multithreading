import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test8 extends Thread {
	private String message;
	
	public Test8(String message){
		this.message=message;
	}
	public void run(){
		System.out.println(Thread.currentThread().getName()+"(start) message"+message);
		try{Thread.sleep(2000);}catch(Exception e){}
		System.out.println(Thread.currentThread().getName()+"(end)"+message);
	}

	public static void main(String[] args) {
		ExecutorService executor=Executors.newFixedThreadPool(10);
		for(int i=0;i<10;i++){
		Test8 t=new Test8(""+i);
		executor.execute(t);
		
		}
		executor.shutdown();
		while(!executor.isTerminated()){}
		
		System.out.println("finished all threads");
	}

}
