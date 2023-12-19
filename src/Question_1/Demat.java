//initializing package
package Question_1;
//importing scanner function 
import java.util.Scanner;

//creating class for demat account 
public class Demat 
{
    //initializing balance
    private static long balance;

    //creating contructor
    public Demat()
    {
        this.balance=0;
    }

      //getting amount from user
    public void inputBalance()
    {
        Scanner scan = new Scanner(System.in);
        balance=scan.nextLong();
    }

    // defining method investing
    public void invest(long amt)
    {
        balance=balance+amt;
    }

    //defining method selling the shares
    public void liquidate(long amt)
    {
        balance=balance-amt;
    }

    // returning final balance
    public long getBalance()
    {
        return balance;
    }
}