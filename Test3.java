
public class Test3 extends Thread {

	public void run(){
		for(int i=1;i<=5;i++){
			try{Thread.sleep(500);}catch(Exception e){}
					System.out.println(i);
		}
	}
	public static void main(String[] args) {

		Test3 t1=new Test3();
		Test3 t2=new Test3();
		t1.run();//if we directly call run method then our main will execute the object
		t2.run();//t1,t2 are treated as normal objects not thread objects
	}

}
