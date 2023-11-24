class BankAccount{
    private
    int accountnumber;
    private String accounthname;
    private int balance;

    BankAccount()
    {
        this.accountnumber=0;
        this.accounthname=null;
        this.balance=0;
    }
    BankAccount(int accountnumber,String accounthname,int balance)
    {
        this.accountnumber=accountnumber;
        this.accounthname=accounthname;
        this.balance=balance;
    }

    public void deposit(int money) {
        if(money>0){
            balance+=money;
        }
        else{
            System.out.println("Enter digits in positive number");
        }
    }
    public void withdraw(int money){
        if(balance>money)
        {
            if(balance-money>0)
            {
                balance-=money;
            }
            else{
                System.out.println("Make a valid withdrawal for the number not going in negative");
            }
        }
        else{
            System.out.println("Enter a small amount");
        }
    }
    public void print(){
        System.out.println("Your account details\n" +
                "Account Holder Name: "+accounthname+"\nBalance: "+balance+"\nAccount Number: "+accountnumber);
    }
}
public class q1
{
    public static void main(String [] args)
    {
        BankAccount b1=new BankAccount(98878729,"muhammad tassadaq abid",780000);
        b1.deposit(500000);
        b1.withdraw(1200000);
        b1.print();
    }

}
