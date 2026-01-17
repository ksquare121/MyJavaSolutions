class BankAcc{
    private int balance;
    public void deposit(int amount){
        if (amount > 0){
            balance += amount;
        }
    }
    public int getbalance(){
        return balance;
    }
}

public class Bank2 {
    public static void main(String[] args) {
        BankAcc myAcc = new BankAcc();
        myAcc.deposit(500);
        System.out.println("Current Balance: " + myAcc.getbalance());
    }
}
