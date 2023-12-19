//initializing package
package Question_1;

//importing all class files
import Question_1.*;

//importing scanner function
import java.util.Scanner;

public class Main 
{
    public static void main(String args[]) 
    {
        // temporary variable used inside do-while loop
        int n = 0;
        // initializing scanner function
        Scanner scan = new Scanner(System.in);
        do 
        {
            System.out.println("-----------------");
            System.out.print("1. Current Account \n2. Savings Account \n3. Demat Account \n");
            // getting user option
            int e = scan.nextInt();
            System.out.println("-----------------");
            // e=1 for current account
            switch (e) 
            {
                case 1: 
                {
                    // creating object for current account
                    Current curr = new Current();
                    // getting amount
                    System.out.println("Enter amount to create a current account : ");
                    curr.inputBalance();

                    System.out.println("-----------------");
                    System.out.print("1. deposit \n2. Withdraw \n");
                    // getting user option for withdraw or deposit
                    n = scan.nextInt();
                    System.out.println("-----------------");

                    switch (n) 
                    {
                        // case 1 for deposit
                        case 1: 
                        {
                            System.out.println("Enter amount to deposit in current account : ");
                            // getting amount to deposit
                            curr.deposit(scan.nextLong());
                            // getting current balance
                            System.out.print("Current balance in current account : " + curr.getBalance() + "\n");
                            System.out.println("-----------------------------------");
                            break;
                        }
                        // case 2 for withdraw
                        case 2: 
                        {
                            System.out.println("Enter amount to withdraw in current account : ");
                            // getting amount to withdraw
                            curr.withdraw(scan.nextLong());
                            // getting current balance
                            System.out.print("Current balance in current account : " + curr.getBalance() + "\n");
                            System.out.println("-----------------------------------");
                            break;

                        }
                        default: 
                        {
                            System.out.println("Enter valid number");
                            break;
                        }
                    }

                    System.out.println("1.Create a fixed deposit in your current account \n2.No");
                    n = scan.nextInt();
                    switch (n) 
                    {
                        // case 1 for opening fixed deposit
                        case 1: 
                        {
                            // creating fd object
                            FD fix = new FD();
                            System.out.println("Enter amount to deposit in fixed deposit from your current account : ");
                            // getting amount to deposit
                            fix.inputAmount();
                            curr.withdraw(fix.getAmount());

                            // getting years to deposit
                            System.out.println("Enter how many years to deposit : ");
                            int years = scan.nextInt();

                            // calculating fixed deposit for less than 2 years
                            if (years == 1 || years == 2) 
                            {
                                double maturity = fix.interest_5(years);
                                System.out.println("Your Maturity amount for " + years + " years is : " + maturity);
                                // getting current balance
                            }

                            // calculating fixed deposit for 3 to 5 years
                            else if (years > 2 && years < 6) 
                            {
                                double maturity = fix.interest_7(years);
                                System.out.println("Your Maturity amount for " + years + " years is : " + maturity);
                                // getting current balance
                            }

                            // caculating fixed deposit for more than 5 years
                            else if (years > 5) 
                            {
                                double maturity = fix.interest_8(years);
                                System.out.println("Your Maturity amount for " + years + " years is : " + maturity);
                                // getting current balance
                            }
                            System.out.print("Current balance in current account after fixed depositing : "
                                    + curr.getBalance() + "\n");
                            System.out.println("-----------------------------------");
                            break;
                        }

                        // case for not opening
                        case 2:
                            System.out.println("Thank You.");
                            break;

                        default:
                            System.out.println("Enter a valid number.");
                            break;
                    }
                    break;
                }
                // case 2 for savings account
                case 2: 
                {
                    // creating object for savings account
                    Savings sav = new Savings();
                    System.out.println("Enter amount to create a savings account : ");
                    // getting amount
                    sav.inputBalance();

                    System.out.println("-----------------");
                    System.out.print("1. deposit \n2. Withdraw \n");
                    // getting user option for withdraw or deposit
                    n = scan.nextInt();
                    System.out.println("-----------------");

                    switch (n) 
                    {
                        // case 1 for deposit
                        case 1: 
                        {
                            System.out.println("Enter amount to deposit in savings account : ");
                            // getting amount to deposit
                            sav.deposit(scan.nextLong());
                            // getting current balance
                            System.out.print("Current balance in savings account : " + sav.getBalance() + "\n");
                            System.out.println("-----------------------------------");
                            break;
                        }
                        // case 2 for withdraw
                        case 2: 
                        {
                            System.out.println("Enter amount to withdraw in savings account : ");
                            // getting amount to withdraw
                            sav.withdraw(scan.nextLong());
                            // getting current balance
                            System.out.print("Current balance in savings account : " + sav.getBalance() + "\n");
                            System.out.println("-----------------------------------");
                            break;

                        }
                        default: 
                        {
                            System.out.println("Enter valid number");
                            break;
                        }
                    }

                    System.out.println("1.Create a fixed deposit in your savings account \n2.No");
                    n = scan.nextInt();
                    switch (n) 
                    {
                        // case 1 for opening fixed deposit
                        case 1: 
                        {
                            // creating fd object
                            FD fix = new FD();
                            System.out.println("Enter amount to deposit in fixed deposit from your savings account : ");
                            // getting amount to deposit
                            fix.inputAmount();
                            sav.withdraw(fix.getAmount());

                            // getting years to deposit
                            System.out.println("Enter how many years to deposit : ");
                            int years = scan.nextInt();

                            // calculating fixed deposit for less than 2 years
                            if (years == 1 || years == 2) 
                            {
                                double maturity = fix.interest_5(years);
                                System.out.println("Your Maturity amount for " + years + " years is : " + maturity);
                                // getting current balance
                            }

                            // calculating fixed deposit for 3 to 5 years
                            else if (years > 2 && years < 6) 
                            {
                                double maturity = fix.interest_7(years);
                                System.out.println("Your Maturity amount for " + years + " years is : " + maturity);
                                // getting current balance
                            }

                            // caculating fixed deposit for more than 5 years
                            else if (years > 5) 
                            {
                                double maturity = fix.interest_8(years);
                                System.out.println("Your Maturity amount for " + years + " years is : " + maturity);
                                // getting current balance
                            }
                            System.out.print("Current balance in savings account after fixed depositing : "
                                    + sav.getBalance() + "\n");
                            System.out.println("-----------------------------------");
                            break;
                        }

                        // case for not opening
                        case 2:
                            System.out.println("Thank You.");
                            break;

                        default:
                            System.out.println("Enter a valid number.");
                            break;
                    }
                    break;
                }
                // case 3 for demat account
                case 3: 
                {
                    // creating object for demat account
                    Demat dem = new Demat();
                    System.out.println("Enter amount to create a demat account : ");
                    // getting amount
                    dem.inputBalance();

                    System.out.println("-----------------");
                    System.out.print("1. Invest \n2. Liquidate \n");
                    // getting user option for investing or liquidating
                    n = scan.nextInt();
                    System.out.println("-----------------");

                    switch (n) 
                    {
                        // case 1 for investing
                        case 1: 
                        {
                            System.out.println("Enter amount to invest in demat account : ");
                            // getting amount to invest
                            dem.invest(scan.nextLong());
                            // getting current balance
                            System.out.print(
                                    "Your current invested amount in demat account : " + dem.getBalance() + "\n");
                            System.out.println("-----------------------------------");
                            break;
                        }

                        // case 2 for liquidating
                        case 2: 
                        {
                            System.out.println("Enter amount to sell shares in demat account : ");
                            // getting amount to liquidating
                            dem.liquidate(scan.nextLong());
                            // getting current balance
                            System.out.print(
                                    "Your current invested amount in savings account : " + dem.getBalance() + "\n");
                            System.out.println("-----------------------------------");
                            break;

                        }
                        default: 
                        {
                            System.out.println("Enter valid number");
                            break;
                        }
                    }
                    break;
                }
                default: 
                {
                    System.out.println("Enter valid number");
                    break;
                }
            }
            // returning to main menu
            System.out.println(" Press 0 to return back to main menu");
            n = scan.nextInt();

        } while (n == 0);
    }
}