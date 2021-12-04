package EA;

import java.util.ArrayList;

public class Account2 extends Account {
	private String name;
	private int id;
	private double balance;
	private ArrayList<Transaction> transactions=new ArrayList<Transaction>();
	Account2(String name,int id,double balance){
		super(id);
		this.id=id;
		this.balance=balance;
	}
	public void withdraw(ArrayList<Transaction> transactions) {
		transactions.remove(transactions.size()-1);
	}
	public void deposit(ArrayList<Transaction> transactions,Transaction t) {
		transactions.add(t);
	}
	

}
