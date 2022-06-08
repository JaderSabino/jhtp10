public class Account {
    private String name;
    private double balance;

    public Account(String name, double depositInitial) {
        this.name = name;

        if (depositInitial > 0.0)
            this.balance = depositInitial;
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0)
            this.balance = this.balance + depositAmount;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void withdrawal(double withdrawalAmount) {
        if (withdrawalAmount < this.balance) {
            this.balance = this.balance - withdrawalAmount;
        } else {
            System.out.printf("withdrawal amount exceeded account balance%n%n");
        }
            
    }

}
