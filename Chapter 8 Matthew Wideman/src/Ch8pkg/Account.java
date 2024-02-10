package Ch8pkg;

import java.util.Date;

public class Account {

	private int id = 0001;
	private double balance = 0;
	private double annualInterestRate = 0.0;
	private double monthlyInterestRate = annualInterestRate/12;
	Date dateCreated = new Date();
	
	public void withdraw(double amount) {
		balance = balance - amount;
	}
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	public Account() {
		
	}
	public Account(int id, double bal, double ir) {
		setId(id);
		setBalance(bal);
		setAnnualInterestRate(ir);
	
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setBalance(double bal) {
		this.balance = bal;
	}
	public void setAnnualInterestRate(double ir) {
		this.annualInterestRate = ir;
	}
	public int getId() {
		return this.id;
	}
	public double getBalance() {
		return this.balance;
	}
	public double getMonthlyInterest() {
		return this.balance * this.monthlyInterestRate;
	}
	public Date getDateCreated() {
		return this.dateCreated;
	}
}
