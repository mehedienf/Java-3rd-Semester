class Member {
    String name;
    int age;
    String phone;
    String address;
    int salary;

    void printSalary() {
        System.out.println("Salary: " + salary);
    }
}
class Employee extends Member {
    String specilization;
    String depertment;
}
class Manager extends Member {
    String specilization;
    String depertment;
}

public class three {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name = "Employee 1";
        employee1.age = 30;
        employee1.phone = "+8801*********";
        employee1.address = "Dhaka, Bangladesh";
        employee1.salary = 15000;
        employee1.specilization = "Employee";
        employee1.depertment = "Dept. of CCE";

        Manager manager = new Manager();
        manager.name = "Manager";
        manager.age = 32;
        manager.phone = "+8801*********";
        manager.address = "Patuakhali, Barishal";
        manager.salary = 25000;
        manager.specilization = "Manager";
        manager.depertment = "Dept. of CCE";

        System.out.println("Name: " + employee1.name);
        System.out.println("Age: " + employee1.age);
        System.out.println("Phone: " + employee1.phone);
        System.out.println("Address: " + employee1.address);
        // System.out.println(employee1.salary);
        employee1.printSalary();
        System.out.println("Specilization: " + employee1.specilization);
        System.out.println("Depertment: " + employee1.depertment);
        System.out.println();

        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone: " + manager.phone);
        System.out.println("Address: " + manager.address);
        // System.out.println(manager.salary);
        manager.printSalary();
        System.out.println("Specilization: " + manager.specilization);
        System.out.println("Depertment: " + manager.depertment);
    }
}
