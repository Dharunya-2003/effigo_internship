package effigo;

abstract class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    void displayName() {
        System.out.println("Employee: " + name);
    }

    abstract void work();
}

class Manager extends Employee {
    public Manager(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println(name + " is managing the team.");
    }
}

public class abstractionclass {
    public static void main(String[] args) {
        Employee manager = new Manager("Dharunya");

        manager.displayName();
        manager.work();
    }
}
