// WAP to create a bank account class with private variables, account number,
// account holder name, balance and the public methods deposite,
// withdrawl, getbalance, getAccountDetails.

class BankAccount{
    private String accountNumber;
    private String name;
    private double balance;
    
    public BankAccount(String number, String n, double b){
        accountNumber = number;
        name = n;
        balance = b;
    }
    
    public void deposite(){
        System.out.println("In deposite");
    }
    
    public void withDrawl(){
        System.out.println("With draw money");
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void getAccountDetails(){
        System.out.println("Account number: "+accountNumber);
        System.out.println("Name of the account holder: "+name);
        System.out.println("Balance: "+balance);
    }
}

class Assignment1{
    public static void main(String...args){
        BankAccount b = new BankAccount("12345", "Eshwar", 101.0);
        b.getAccountDetails();
    }
}
