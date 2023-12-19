//initializing package
package Question_1;
//importing scanner function 
import java.util.Scanner;

//creating class for fixed deposit
public class FD 
{
    //initializing amount
    private long amount;
    //creating contructor
    public FD()
    {
        this.amount=0;
    }

    //getting amount from user

    public void inputAmount()
    {
        Scanner scan = new Scanner(System.in);
        amount=scan.nextLong();
    }

    public long getAmount()
    {
        return amount;
    }
    // calculating fd for 1 to 2 years 
    public double interest_5(int years)
    {
        //interest is 5% maturity amount is calculated by simple interest formula (p*n*r)/100
        double MaturityAmount = amount+((amount * years * 5)/100);
        return MaturityAmount;
    }

    // calculating fd for 3 to 5 years 
    public double interest_7(int years)
    {
        //interest is 7% maturity amount is calculated by simple interest formula (p*n*r)/100
        double MaturityAmount = amount+((amount * years * 7)/100);
        return MaturityAmount;
    }

    // calculating fd for more than 5 years 
    public double interest_8(int years)
    {
        //interest is 8.5% maturity amount is calculated by simple interest formula (p*n*r)/100
        double MaturityAmount = amount+((amount * years * 8.5)/100);
        return MaturityAmount;
    }
}
