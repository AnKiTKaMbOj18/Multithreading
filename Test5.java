
public class Test5 extends Thread {
	public void run(){
		System.out.println("running");
	}

	public static void main(String[] args) {
		Test5 t1=new Test5();
		Test5 t2=new Test5();
		
		System.out.println("name of thread is:"+t1.getName()+":"+t1.getId());
		System.out.println("name of thread is :"+t2.getName()+": "+t2.getId());
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		
		t1.setName("ammmy");
		System.out.println("name and id of thread after setting value: "+t1.getName()+" :"+t1.getId());
	
	}

}
