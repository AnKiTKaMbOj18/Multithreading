import java.io.IOException;

public class Test10 {

	public static void main(String[] args) {

		Runtime rt=Runtime.getRuntime();
		
		System.out.println("total memory:  "+rt.totalMemory());
		System.out.println("free memory:  "+rt.freeMemory());
		
		for(int i=0;i<=10000;i++){
			new Test10();
		}
		System.out.println("after creating 10000 instances,free memory: "+rt.freeMemory());
		System.gc();
		System.out.println("after gc,free memory: "+rt.freeMemory());

}
}