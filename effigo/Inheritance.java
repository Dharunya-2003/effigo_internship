package effigo;
class Inheritance1{
int emp_id;
String emp_name;
double salary;
}

//Child class (Manager)
class Managerr extends Inheritance1 {
// Method to display manager's responsibility
void ManagerTeam() {
    System.out.println(emp_name + " is managing the team.");
}
}
public class Inheritance {

    public static void main(String[] args) {
        // Creating Manager object
        Managerr mgr = new Managerr();
        
        // Assigning values
        mgr.emp_id = 1;
        mgr.emp_name = "Dharunya";
        mgr.salary = 50000.00;
        
        // Calling method
        mgr.ManagerTeam();
    }
}

