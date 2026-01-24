// Assignment 2

/*
* Create a base class employ with private attributes ID name basic salary and a method called calculate salary
* create subclass called manager , inherit the employ and overload calculate salary by adding a bonus
* */

class Empolye {
    private String ID;
    private String name;
    private double basicSalary;

    public Empolye(String id, String n, double bs) {
        ID = id;
        name = n;
        basicSalary = bs;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double calculateSalary() {
        return basicSalary;
    }
}

class Manager extends Empolye {

    private double bonus = 1546.14;

    public Manager(String id, String n, double bs) {
        super(id, n, bs);
    }

    @Override
    public double calculateSalary() {
        return getBasicSalary() + bonus;
    }

    public double calculateSalary(double PF){
        double salary = getBasicSalary()-PF;
        return salary;
    }

    public void display() {
        System.out.println("Manager Name: " + getName());
        System.out.println("Manager ID: " + getID());
        System.out.println("Total Salary: " + calculateSalary());
        System.out.println("Overloading Calculate salary by deducting the Provident fund: "+calculateSalary(1456));
    }
}

public class Assignment2 {
    public static void main(String... args) {
        Manager m = new Manager("846465ddd", "Rajesh", 1000000.0);
        m.display();
    }
}
