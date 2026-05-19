import java.util.Scanner;
import javax.lang.model.util.ElementScanner14;
class Account1
{
    int acc_no;
    String name;
    float amount;
    void insert(int a,string n,float amt)
    {
        acc_no=a;
        name=n;
        amount=amt;
    }
    void deposit(float amt)
    {
        System.out.println("\n\t\t"+ amt +" deposited");
        amount=amount+amt;
    }
    void withdraw(float amt)
    {
        if(amount<amt)
        {
            System.out.println("Insuffieient Balance");
        }
        //{
           // System.out.printl("Insufficient Balance");

        //}
         else 
         {
            System.out.println("\n\t\t"+amt+"withdrow");
            amount=amount_amt;
         }
    }
    void checkBalance()
    {
        System.out.println("\n\t\t"+"Balance is"+amount);
    }
    void Display()
    {
        System.out.println("\n\t\t acc.no name amount");
        System.out.println("\n\t\t ******************************");
        System.out.println("acc_no+"  " +name+"  +amount);

    }
}
class Account
{
public static void main(String args[])
{
Account a1=new Account1();
Scanner in=new Scanner(System.in);
System.out.println("\n\t\t ***********************************");
System.out.println("\n\t\t CLASSES AND OBJECTS");
System.out.println("\n\t\t *********************************************");
System.out.println("\n\t\t Enter the account number");
int a=in.nextInt();
System.out.println("\n\t\t Account number"+a);
System.out.println("\n\t\t Enter the customer name:");
String s=in.next();
System.out.println("\n\t\t customer name:"+s);
System.out.println("\n\t\t Enter the amount:");
Float b=in.nextFloat();
System.out.println("\n\t\t amount:"+b);
a1.insert(a,s,b);
a1.Display();
a1.checkBalance();
System.out.println("\n\t\t  Enter the Account withdraw");
float wd=in.nextFloat();
System.out.println(wd);
a1.withdraow(wd);
a1.checkBalance();
}}
