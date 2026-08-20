class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

class Manager extends Employee {
    double bonus;

    Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    void display() {
        System.out.println("Manager Details:");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
    }
}

class Clerk extends Employee {
    double allowance;

    Clerk(String name, double salary, double allowance) {
        super(name, salary);
        this.allowance = allowance;
    }

    void display() {
        System.out.println("\nClerk Details:");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Allowance: " + allowance);
    }
}

public class Main {
    public static void main(String[] args) {
        Manager m = new Manager("Rahul", 50000, 10000);
        Clerk c = new Clerk("Amit", 25000, 5000);

        m.display();
        c.display();
    }
}
