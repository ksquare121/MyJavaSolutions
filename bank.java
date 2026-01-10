class BankAccount{
    int accNo;
    String userName;
    float balance;
    
    void show(){
        System.out.println("Account No: " + accNo);
        System.out.println("Account Holder Name: " + userName);
        System.out.println("Balance: " + balance);
    }
}
public class bank{
    public static void main(String args[]){
        BankAccount acc1 = new BankAccount();
        acc1.accNo = 123456;
        acc1.userName = "John Doe";
        acc1.balance = 2500.75f;
        acc1.show();
    }
    
}
