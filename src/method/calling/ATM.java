package method.calling;

public class ATM {
    void show(){
        System.out.println("Welcome to ATM ");
    }

    void withdraw(double amount){
        System.out.println("Withdraw Amount :"+amount);
    }

    double getBalance(){
        return 25000;
    }

    double deposite(int addBalance){
        double add = 25000 + addBalance;
        return add;
    }

    public static void mai(String[] args){
        ATM a = new ATM();
        a.show();
        a.withdraw(5000);
        double balance = a.getBalance();
        System.out.println("Balance :"+balance);
        double ab = a.deposite(7000);
        System.out.println("New Balance : "+ab);
    }
}
