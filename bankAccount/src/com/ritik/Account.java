package com.ritik;

public class Account {

	private static int flag = 0;
	private long account_no = 1000;
	private long addhar_no ;
	private String name;
	private int balance;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(long addhar_no, String name, int balance) {
		super();
		this.addhar_no = addhar_no;
		this.name = name;
		this.balance = balance;
	}

	public long getAccount_no() {
		return account_no;
	}

	public long getAddhar_no() {
		return addhar_no;
	}

	public void setAddhar_no(long addhar_no) {
		flag++;
		account_no= account_no + flag;
		this.addhar_no = addhar_no;
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

	@Override
	public String toString() {
		return "--------------------------------------------------\n"+
			   "Account details \n"+
	           "Account no :"+account_no+"\n"+
			   "Account holder name :"+name+"\n"+
			   "Account balance :"+balance+"\n";
	}

	public static int getFlag() {
		return flag;
	}

	public static void setFlag(int flag) {
		Account.flag = flag;
	}

	public void setAccount_no(long account_no) {
		this.account_no = account_no;
	}
	
	

}
