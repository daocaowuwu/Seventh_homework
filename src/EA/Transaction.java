package EA;
import java.util.Date;

public class Transaction {
	private Date date=new Date();
	private char type;
	private double amount,balance;
	private String description;
	Transaction(Date date,char type,double amount,double balance,String description){
		this.date=date;
		this.type=type;
		this.amount=amount;
		this.balance=balance;
		this.description=description;
	}
	

}
