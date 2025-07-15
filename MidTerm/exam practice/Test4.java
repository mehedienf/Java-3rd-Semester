class Employee {
    void work() {

    }
    void getSalary() {

    }
}
class HRManager extends Employee {
    void work() {
        System.out.println("Managing employees!");
    }
    void addEmployee() {
        System.out.println("Adding new employee!");
    }
}

public class Test4 {
    public static void main(String[] args) {
        HRManager hrManager = new HRManager();
        hrManager.work();
        hrManager.addEmployee();
    }
}
