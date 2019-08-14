package Deposit;

public class Deposit {
    int balance = 0;

    public Deposit(int i) {
        balance = i;
    }

    public int get_balance() {
        return balance;
    }

    public void deposit(int i) {
        balance+=  i;
    }

    public void withdraw(int i) {
        if(i<=balance){
            balance-= i;
        }
    }

    public void send(Deposit b, int i) {
        //i 송금금액 a- b+
        if(balance>=i) {
            this.withdraw(i);
            b.deposit(i);
        }

    }
}
