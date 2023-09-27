import java.util.*;

class Employee {
    int salary;
    String name;

    // Getter for salary
    public int getSalary() {
        return salary;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String newName) {
        name = newName;
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee employee = new Employee();

        Scanner scanner = new Scanner(System.in);

        // Get employee name
        System.out.print("Enter Employee Name: ");
        employee.name = scanner.nextLine();

        // Get employee salary
        System.out.print("Enter Salary: ");
        employee.salary = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        // Display employee name and salary
        System.out.printf("Name Is: %s\n", employee.getName());
        System.out.printf("Salary Is: %d\n", employee.getSalary());
        

        // Get new employee name
        System.out.print("Enter New Employee Name: ");
        String newName = scanner.nextLine();
        employee.setName(newName);

        // Display the new employee name
        System.out.printf("New Name Is %s\n", employee.getName());
    }
}
