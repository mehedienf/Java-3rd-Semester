class Person {
    void getFirstName() {
        System.out.println("First name");
    }
    void getLastName() {
        System.out.println("Last name");
    }
}
class Employee extends Person {
    void getEmployeeId() {
        System.out.println("ID");
    }
    void getLastName() {
        System.out.println("Last name\nJob title");
    }
}

public class n7 {
    public static void main(String[] args) {
        Person person = new Person();
        person.getFirstName();
        person.getLastName();

        Employee employee = new Employee();
        employee.getEmployeeId();
        employee.getLastName();
    }
}
