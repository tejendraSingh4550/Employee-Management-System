import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeService {

    ArrayList<Employee> employees = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addEmployee() {

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        employees.add(new Employee(id, name, department, salary));

        System.out.println("\nEmployee Added Successfully.\n");
    }

    public void viewEmployees() {

        if (employees.isEmpty()) {
            System.out.println("\nNo Employees Found.\n");
            return;
        }

        for (Employee e : employees) {
            System.out.println("----------------------");
            System.out.println(e);
        }

        System.out.println("----------------------");
    }

    public void searchEmployee() {

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        for (Employee e : employees) {

            if (e.getId() == id) {

                System.out.println("\nEmployee Found\n");
                System.out.println(e);
                return;
            }
        }

        System.out.println("\nEmployee Not Found.\n");
    }

    public void deleteEmployee() {

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        for (Employee e : employees) {

            if (e.getId() == id) {

                employees.remove(e);
                System.out.println("\nEmployee Deleted Successfully.\n");
                return;
            }
        }

        System.out.println("\nEmployee Not Found.\n");
    }
}