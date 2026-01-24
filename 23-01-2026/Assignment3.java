// Assignment 3

/*
 * Design a payment system with the parent class Payment
 * and its subclasses UPI, Card, and Cash using method overriding.
 */

abstract class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    // Method to be overridden by subclasses
    public abstract void pay();
}

class UPI extends Payment {

    public UPI(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println("Payment of rs" + amount + " done using UPI.");
    }
}

class Card extends Payment {

    public Card(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println("Payment of rs" + amount + " done using Card.");
    }
}

class Cash extends Payment {

    public Cash(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println("Payment of rs" + amount + " done using Cash.");
    }
}

public class Assignment3 {
    public static void main(String[] args) {

        Payment p1 = new UPI(500);
        Payment p2 = new Card(1200);
        Payment p3 = new Cash(300);

        p1.pay();
        p2.pay();
        p3.pay();
    }
}
