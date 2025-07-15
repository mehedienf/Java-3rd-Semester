class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;
    void printSalary() {
        System.out.println("Salary of " + name + " is: " + salary);
    }
}
class Employee extends Member {
    String specialization;
}
class Manager extends Member {
    String department;
}

public class n3 {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Manager manager = new Manager();

        employee1.specialization = "Employee specialization";
        employee1.name = "employee Name";
        employee1.age = 50;
        employee1.phoneNumber = "+8801************";
        employee1.address = "Dhaka, Bangladesh";
        employee1.salary = 15000;

        manager.department = "Department name";
        manager.name = "Manager Name";
        manager.age = 45;
        manager.phoneNumber = "+8801***********";
        manager.address = "Chottogram, Bangladesh";
        manager.salary = 30000;
        
        System.out.println("Employee 1 Info:\n" + employee1.specialization + "\n" + employee1.name + "\n" + employee1.age + "\n" + employee1.phoneNumber + "\n" + employee1.address + "\n" + employee1.salary);
        System.out.println("\nManager Info:\n" + manager.department + "\n" + manager.name + "\n" + manager.age + "\n" + manager.phoneNumber + "\n" + manager.address + "\n" + manager.salary);
    }
}
