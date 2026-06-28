import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeService service = new EmployeeService();

        while (true) {

            System.out.println("\n===== Employee Management System =====");

            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    service.addEmployee();
                    break;

                case 2:
                    service.viewEmployees();
                    break;

                case 3:
                    service.searchEmployee();
                    break;

                case 4:
                    service.deleteEmployee();
                    break;

                case 5:
                    System.out.println("\nThank You!");
                    System.exit(0);

                default:
                    System.out.println("\nInvalid Choice.");
            }

        }

    }
}