class Customer1 {
	int amount = 10000;

	synchronized void withdraw(int wdamount) {
		System.out.println("going to withdraw");

		if (this.amount < wdamount) {
			System.out.println("balance low,waiting for deposit,current balance is: " + this.amount);
			System.out.println("amount entered for withdrawing is: " + wdamount);
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("balance before withdrawing: " + this.amount);
		
		this.amount = this.amount - wdamount;
	
		System.out.println("withdrawn amount is: " + wdamount);
		System.out.println("withdraw complete,balance after withdrawing: " + this.amount);
	}

	synchronized void deposit(int dpamount) {
		
		System.out.println("balance before deposit: " + this.amount);
		
		this.amount = this.amount + dpamount;
		
		System.out.println("deposited amount is: " + dpamount);
		System.out.println("deposit successfull,balance after depositing: " + this.amount);
		notifyAll();
	}
}

class Withdraw extends Thread {
	Customer1 c;

	Withdraw(Customer1 c) {
		this.c = c;
	}

	public void run() {
		c.withdraw(15000);
	}
}

class Deposit extends Thread {
	Customer1 c;

	Deposit(Customer1 c) {
		this.c = c;
	}

	public void run() {
		c.deposit(10000);
	}
}

public class InterThreadCom21 {

	public static void main(String[] args) {
		Customer1 c1 = new Customer1();
		Withdraw wd = new Withdraw(c1);
		Deposit dp = new Deposit(c1);
		
		wd.start();
		dp.start();

	}

}
