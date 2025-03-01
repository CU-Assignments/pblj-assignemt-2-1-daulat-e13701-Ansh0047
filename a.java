// a. Employee Management System
// File: EmployeeManagement.java
import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add 2. Update 3. Remove 4. Search 5. Display 6. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: 
                    System.out.println("Enter ID, Name, Salary:");
                    employees.add(new Employee(sc.nextInt(), sc.next(), sc.nextDouble()));
                    break;
                case 2:
                    System.out.println("Enter ID to update:");
                    int updateId = sc.nextInt();
                    for (Employee emp : employees) {
                        if (emp.id == updateId) {
                            System.out.println("Enter new Name and Salary:");
                            emp.name = sc.next();
                            emp.salary = sc.nextDouble();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter ID to remove:");
                    int removeId = sc.nextInt();
                    employees.removeIf(emp -> emp.id == removeId);
                    break;
                case 4:
                    System.out.println("Enter ID to search:");
                    int searchId = sc.nextInt();
                    for (Employee emp : employees) {
                        if (emp.id == searchId) System.out.println(emp);
                    }
                    break;
                case 5:
                    employees.forEach(System.out::println);
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }
}
