class Person {
    private String firstName;
    private String lastName;
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
}
class Employee extends Person {
    int employeeID;
    String jobTitle;
    Employee(String firstName, String lastName, int employeeID, String jobTitle) {
        super(firstName, lastName);
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
    }
    int getEmployeeId() {
        return employeeID;
    }
    String getLastNmae() {
        return super.getLastName() + " (" + jobTitle + ")" ;
    }
}

public class Test6 {
    public static void main(String[] args) {
        Employee employee = new Employee("Mehedi", "Enam", 2202050, "Student");
        System.out.println("First Name: " + employee.getFirstName());
        System.out.println("Last Name: " + employee.getLastName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
    }
}
