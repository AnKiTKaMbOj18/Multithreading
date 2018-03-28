class Customer {
	int amount = 10000;

	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw");

		if (this.amount < amount) {
			System.out.println("less balance; waiting for deposit");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.amount = this.amount - amount;
		System.out.println("withdraw completed,balance after withraw: " + this.amount);

	}

	synchronized void deposit(int amount) {
		System.out.println("going to deposit");
		this.amount = this.amount + amount;
		System.out.println("deposit complete,balance after deposit:  " + this.amount);
		notify();
	}
}

class One extends Thread {
	Customer c;

	public One(Customer c) {
		this.c = c;
	}

	public void run() {
		c.withdraw(15000);
	}

}

class Two extends Thread {
	Customer c;

	public Two(Customer c) {
		this.c = c;
	}

	public void run() {
		c.deposit(10000);
	}
}

public class InterThreadCom20 {

	public static void main(String[] args) {
		final Customer c = new Customer();
		One one = new One(c);
		Two two = new Two(c);

		one.start();
		two.start();
	}

}
