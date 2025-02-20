package effigo;

// Defining an interface
interface Employee111 {
    void work(); // Abstract method
}

// Implementing the interface in Manager class
class Manager11 implements Employee111 {
    @Override
    public void work() {
        System.out.println("The Manager is managing the team.");
    }
}

// Main class
public class AbstractionWithInterface {
    public static void main(String[] args) {
        // Creating object of Manager1 using interface reference (Polymorphism)
        Employee111 manager = new Manager11();
        manager.work();
    }
}
