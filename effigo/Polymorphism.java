package effigo;

// Employee class demonstrating method overloading (Compile-time Polymorphism)
class Employee11 {
    String name;
    double salary;

    // Method with two parameters (Salary with Bonus)
    double calSalary(double basicSalary, double bonus) {
        return basicSalary + bonus;
    }

    // Method with one parameter (Salary without Bonus)
    double calSalary(double basicSalary) {
        return basicSalary;
    }
}

// Main class
public class Polymorphism {
    public static void main(String[] args) {
        Employee11 emp = new Employee11();

        // Calling overloaded methods
        System.out.println("Salary with bonus: " + emp.calSalary(50000, 5000));
        System.out.println("Salary without bonus: " + emp.calSalary(50000));
    }
}
