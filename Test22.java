class Reentrant{
	public synchronized void m(){
		n();
		System.out.println("this is m() method");
	}
	public synchronized void n(){
		System.out.println("this is n() method");
	}
}
public class Test22 extends Thread {
	Reentrant r;
	Test22(Reentrant r){
		this.r=r;
	}
	public void run(){
		r.m();
	}
	public static void main(String[] args) {
		Reentrant r=new Reentrant();
		Test22 t=new Test22(r);
		
		t.start();
		
	}

}
