package effigo;

public interface Employee1 {
    void work();
}

class Manager2 implements Employee1 {
    public void work() {
        System.out.println("The manager is managing the team");
    }



    public static void main(String[] args) {
        Employee1 manager2 = new Manager2(); 
        manager2.work(); 
    }
}
