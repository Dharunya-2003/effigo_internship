package effigo;

// Parent class
class Employeel {
    String name;

    // Parent class method
    void work() {
        System.out.println(name + " is working.");
    }
}

// Child class (Method Overriding)
class Manager1 extends Employeel {
    // Overriding work() method
    @Override
    void work() {
        System.out.println(name + " is managing the team.");
    }
}

// Main class
public class Overridding {
    public static void main(String[] args) {
        // Creating object of Manager (Polymorphism)
        Employeel mgr = new Manager1();
        
        // Assigning name
        mgr.name = "Dharunya";
        
        // Calling overridden method
        mgr.work();
    }
}
