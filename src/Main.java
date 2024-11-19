import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        EmployeeManager employeeManager = new EmployeeManager();
        boolean run = true;

        while(run){
            System.out.println("\n--- Welcome to Employee Management System ---");
            System.out.println("Please type the respective number to choose your action");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees with Bonuses");
            System.out.println("3. Update Employee's Salary");
            System.out.println("4. Display Employee Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.print("\nYou choose add a employee please choose 1 for Full-Time or 2 for Part-time: ");
                    int type = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Please type the name of new Employee: ");
                    String name = scanner.nextLine();
                    System.out.print("Please type the ID for the new Employee: ");
                    int employeeId = scanner.nextInt();
                    System.out.print("Please type the Salary for the new Employee: ");
                    double salary = scanner.nextDouble();

                    if(type == 1){
                        employeeManager.AddEmployee(new FullTimeEmployee(name, employeeId, salary));
                    } else if (type == 2) {
                        employeeManager.AddEmployee(new PartTimeEmployee(name, employeeId, salary));
                    }else {
                        System.out.println("\nThe option related to the Full or Part time is not correct and was not possible add the new employee.\nPlease try again and in this step choose only 1 - Full or 2 - Part options.");
                    }
                    break;
                case 2:
                    System.out.println("\nYou choose show all the employees and roles");
                    employeeManager.DisplayAllEmployeeAndRoles();
                    break;
                case 3:
                    System.out.print("\nYou choose update an employee salary. Please type the employeeId: ");
                    int empID = scanner.nextInt();
                    System.out.print("Please type the new salary for this employee: ");
                    double newSalary = scanner.nextDouble();
                    employeeManager.UpdateEmployeeSalary(empID, newSalary);
                    break;
                case 4:
                    System.out.print("\nYou choose display an employee details, so please type the employeeId: ");
                    int eID = scanner.nextInt();
                    employeeManager.DisplayEmployeeDetailsAndBonus(eID);
                    break;
                case 5:
                    System.out.println("\nYou choose exit the program, thank you for use this one!");
                    run = false;
                    return;
                default:
                    System.out.println("\nInvalid choice! Please try again.");
            }
        }
        scanner.close();
    }
}
