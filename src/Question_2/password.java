//initializing package
package Question_2;
//importing scanner function
import java.util.Scanner;

public class password 
{
    //intializing password as private variable
    private String pass;

    //initializing constructor
    public password()
    {
        this.pass="";
    }

    //getting input from user
    public void setPassword()
    {
        Scanner scan = new Scanner(System.in); 
        pass=scan.nextLine();
    }

    public String getPassword()
    {
        return pass;
    }
}
