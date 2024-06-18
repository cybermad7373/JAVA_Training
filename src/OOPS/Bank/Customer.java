package OOPS.Bank;

import java.util.Random;
public class Customer {

}
class Account{
    Random random = new Random();
    String user ;
    int balance;
    float acc_no;

    Account(String u ,int b ){
        this.user = u;
        this.balance = b;
        this.acc_no = random.nextLong();
    }

    public void Withdraw(int amt){
        balance -=amt;
    }
    public void Deposit(int amt){
        balance +=amt;
    }
    public  void check(){
        System.out.println("The balance amount is Rs."+balance);
    }
}
