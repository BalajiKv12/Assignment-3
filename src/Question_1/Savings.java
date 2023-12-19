//initializing package
package Question_1;
//importing scanner function 
import java.util.Scanner;

//importing account class file 
import Question_1.Account;

//creating class for savings account by implementing Account interface
public class Savings implements Account
{
    //initializing balance
    private static long balance;

    //creating contructor
    public Savings()
    {
        this.balance=0;
    }

    //getting amount from user

    public void inputBalance()
    {
        Scanner scan = new Scanner(System.in);
        balance=scan.nextLong();
    }

    // defining method deposit
    public void deposit(long amt)
    {
        balance=balance+amt;
    }

    //defining method withdraw
    public void withdraw(long amt)
    {
        balance=balance-amt;
    }

    // returning final balance
    public long getBalance()
    {
        return balance;
    }
}
