package com.ritik;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Statement {

	private long account_no;
	private LocalDateTime date_time;
	private int withdrwal ;
	private String name;
	private int deposite;
	private int balance;

	
	public Statement(Account ac)
	{
		super();
		this.account_no = ac.getAccount_no();
		this.balance = ac.getBalance();
	    this.name = ac.getName();
	    this.date_time = LocalDateTime.now();
	}


	public Statement() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void setWithdrwal(int withdrwal) {
		this.withdrwal = withdrwal;
	}


	public void setDeposite(int deposite) {
		this.deposite = deposite;
	}

	
	public long getAccount_no() {
		return account_no;
	}
	
	public void setAccount_no(long account_no) {
		this.account_no = account_no;
	}
	
	public void showdetails()
	{
		System.out.print("--------------------------------------------\n"
				+ " ********* Bank statement ******** \n"
	            + "Acount number :      " + account_no + "\n"
				+ "Account Holder Name :" + name+ "\n\n"
				+"-------------------------------------------------------\n"
				+"  date\t time\t   withdrwal   deposit   balance\t\n"
				+"--------------------------------------------------------\n");
	}

	@Override
	public String toString() {
		return    date_time.format(DateTimeFormatter.ofPattern("yyyy-MM-dd  HH:mm:ss"))
			    + "\t  "+withdrwal+"\t   "+deposite+"\t  "+balance+" ";
		}


	public LocalDateTime getDate_time() {
		return date_time;
	}


	public void setDate_time(LocalDateTime date_time) {
		this.date_time = date_time;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}


	public int getWithdrwal() {
		return withdrwal;
	}


	public int getDeposite() {
		return deposite;
	}
	
	


}
