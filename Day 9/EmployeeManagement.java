import java.util.*;

class Employee {
    int employeeId;
    int salary;
    int joiningYear;
    String employeeName;

    // Method to print employee details
    public void printDetails() {
        System.out.printf("Employee ID: %d, Name: %s, Monthly Earning: %d, Joined in: %d\n", employeeId, employeeName, salary, joiningYear);
    }

    // Method to get employee salary
    public int getSalary() {
        return salary;
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee employee1 = new Employee(); // Instantiate a new Employee object
        Employee employee2 = new Employee(); // Instantiate a second Employee object

        // Set details for employee1
        employee1.employeeId = 67;
        employee1.employeeName = "Employee1Working";
        employee1.salary = 95000;
        employee1.joiningYear = 1995;

        // Set details for employee2
        employee2.employeeId = 88;
        employee2.employeeName = "Employee2Working";
        employee2.salary = 65000;
        employee2.joiningYear = 2005;

        // Print details for both employees
        employee1.printDetails();
        employee2.printDetails();

        // Print salary for employee2
        System.out.println("Employee2 Salary: " + employee2.getSalary());

        // Print salary for employee1
        System.out.println("Employee1 Salary: " + employee1.getSalary());
    }
}
