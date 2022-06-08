public class Invoice {
    private String number;
    private String description;
    private int quantity;
    private double amount;

    public Invoice(String number, String description, int quantity, double amount) {

        this.number = number;
        this.description = description;

        if (quantity < 0) {
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        }

        if (amount < 0.0) {
            this.amount = 0.0;
        } else {
            this.amount = amount;
        }

    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return this.number;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        }
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setAmount(int amount) {
        if (amount < 0.0) {
            this.amount = 0.0;
        } else {
            this.amount = amount;
        }
    }

    public double getAmount() {
        return this.amount;
    }

    public double getInvoiceAmount() {
        return this.quantity * this.amount;
    }
}
