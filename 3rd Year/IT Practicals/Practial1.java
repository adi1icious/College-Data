package practial1;

import java.util.*;
/**
 * @author Aditya
 */

class BankAccount{
    public int Account_Number;
    public float Balance;
    public static int Account=0;
    
    BankAccount(){
        Account_Number=Account;
        Account+=1;
        Balance=0;
    }
    
    BankAccount(float x){
        Account_Number=Account;
        Account+=1;
        Balance=x;
    }
    
    float Deposit(float x){
        if(x>=1)
            Balance+=x;
        else
            System.out.println("You can not deposit negative amount!");
        return 0;
    }
    
    float withdaw(float x){
        if(x>=1 && x<=Balance)
            Balance-=x;
        else
            System.out.println("You can not withdraw more than Balance!");
        return 0;
    }
    
    int getAccountNo(){
        return Account_Number;
    }
    
    float getBalance(){
        return Balance;
    }
    
    void taxDeduction(float Tax){
        Balance-=Tax;
    }
}

class Bank extends BankAccount{
    private ArrayList<BankAccount> account= new ArrayList<>();
    
    void AddAccount(BankAccount b){
        account.add(b);
    }
    
    void BalanceInBank(){
        float f=0;
        for(int i=0;i<account.size();i++){
            BankAccount b= account.get(i);
            f+=b.getBalance();
        }
        System.out.println("Total account balance in the Bank is: "+f);
    }
    
    void MaxAndMin(){
	BankAccount t1 = account.get(0);
	int max = t1.getAccountNo(), min = t1.getAccountNo();
	float minBal=t1.getBalance(), maxBal=t1.getBalance();

	for(int i=1; i<account.size(); i++){
            BankAccount t = account.get(i);
            
            if(t.getBalance()<minBal){
		minBal = t.getBalance();
		min = t.getAccountNo();
            }
            
            if(t.getBalance()>maxBal){
		maxBal = t.getBalance();
		max = t.getAccountNo();
            }
	}
        
	System.out.println("Max Balance is in Account: "+ max);
	System.out.println("Min Balance is in Account: "+ min);
	}
    
    void SearchAccount(int No){
        int Ac=0;
            for(int i=0; i<account.size(); i++){
		BankAccount t = account.get(i);
		if(t.getAccountNo()==No){
                    Ac+=1;
                    break;
		}
            }
	if(Ac>0)
            System.out.println("Account Found Successfully!");
	else
            System.out.println("Account Not Found");
    }

    void Count(float x){
        int cnt=0;
        for(int i=0; i<account.size(); i++){
            BankAccount t = account.get(i);
            if(t.getBalance()>x){
                cnt+=1;
            }
        }
        System.out.println("Count of Accounts having balance of atleast "+x+" is: "+cnt);
    }
}

    
class Practial1 {
    public static void main(String[] args) {
        Bank Aditya=new Bank();
        Aditya.AddAccount(new BankAccount(9000));
        Aditya.AddAccount(new BankAccount(3423));
        Aditya.AddAccount(new BankAccount(5784));
        Aditya.AddAccount(new BankAccount(1657));
        Aditya.AddAccount(new BankAccount(7943));
        Aditya.BalanceInBank();
	Aditya.MaxAndMin();
	Aditya.SearchAccount(5);
	Aditya.Count(3500);
        Aditya.AddAccount(new BankAccount(7344));
        Aditya.BalanceInBank();
        Aditya.Count(3500);
    }  
}