import java.util.Random;
import java.util.*;

public class BankAccount {
private  String account_number;
private  double cheking_balance ;
private double saving_balance;
private static double  accounts_numbers;
private static double total_amount ;

public BankAccount(String account_number, double cheking_balance, double saving_balance) {
	super();
	this.account_number = account_number;
	this.cheking_balance = cheking_balance;
	this.saving_balance = saving_balance;
	random_acc();
	accounts_numbers++;
	
}
public BankAccount() {
	// TODO Auto-generated constructor stub
}
public String getAccount_number() {
	return account_number;
}
public void setAccount_number(String account_number) {
	this.account_number = account_number;
}
public double getCheking_balance() {
	return cheking_balance;
}
public  void setCheking_balance(double cheking_balance) {
	this.cheking_balance = cheking_balance;
}
public double getSaving_balance() {
	
	
	return saving_balance;
}
public void setSaving_balance(double saving_balance) {
	this.saving_balance = saving_balance;
}
public static double getAccounts_numbers() {
	return accounts_numbers;
}
public static void setAccounts_numbers(double accounts_numbers) {
	BankAccount.accounts_numbers = accounts_numbers;
}
public static double getTotal_amount() {
	return total_amount;
}
public static void setTotal_amount(double total_amount) {
	BankAccount.total_amount = total_amount;
}

private int random_acc () {
	Random r = new Random();
	int ten=0 ;
	int sec=1;
	for (int i =1 ;i<=10;i++) {
	 ten += r.nextInt(10);
	 sec=ten*10;
	}
	return sec ;
	
}

public  void  depostie(double x,int s ) {
//	System.out.println("enter the amount of deposie");
//	Scanner input= new Scanner(System.in);
//	x=input.nextInt();
	double saving =0;
	double check=0;
//	System.out.println("where do u want to deposite 1-check \n 2-saiving");
//	s=input.nextInt();
	if(s==1) {
		check=getCheking_balance()+x;
		setCheking_balance(check);
		x+=saving;
		
		
	}else if(s==2) {
		saving=getSaving_balance()+x;
		setSaving_balance(saving);
		x+=saving;
		
		
	}
	double the = getSaving_balance()+getCheking_balance();
	setTotal_amount(the);
	}

public void withdraw(int x ) {
	System.out.println("to withdrawl enter the amount ");
	Scanner input= new Scanner(System.in);
	double  r ;
	if(getTotal_amount()>=0) {
	x=input.nextInt();
	r=getTotal_amount();
	r-=x;
	setTotal_amount(r);
	}else
		System.out.println("u don't have enogh chash");
	
	
}

public void print() {
	System.out.println("for the checking"+getCheking_balance());
	System.out.println("for the checking"+getSaving_balance());
	System.out.println("for the checking"+getTotal_amount());
}




 
}