class Employee {
    void work() {

    }
}
class HRManager extends Employee {
    void work() {

    }
    void employee() {

    }
}

public class n4 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.work();
        HRManager hrManager = new HRManager();
        hrManager.work();
        hrManager.employee();
    }
}
