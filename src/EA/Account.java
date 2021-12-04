package EA;
import java.util.Date;

public class Account {
	private int id=0;
	private double balance=0;
	private double annualInterestRate=0;
	private Date dateCreated=new Date();
	
	Account(){
	}
	Account(int id){
		this.id=id;
	}
	public int get_id() {
		return id;
	}
	public void set_id(int id) {
		this.id=id;
	}
	public double get_balance() {
		return balance;
	}
	public void set_balance(double balance) {
		this.balance=balance;
	}
	public double get_annualInterestRate() {
		return annualInterestRate;
	}
	public void set_annualInterestRate(double annualInterestRate) {
		this.annualInterestRate=annualInterestRate;
	}
	public Date get_dataCreated() {
		return dateCreated;
	}
	public double getMonthlyInterestRate() {
		return annualInterestRate/12;
	}
	public double getMonthlyInterest() {
		return balance*annualInterestRate/12;
	}
	public void withDraw(double money) {
		balance-=money;
	}
	public void deposit(double money) {
		balance+=money;
	}
	

}
