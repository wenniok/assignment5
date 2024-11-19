import java.util.ArrayList;
import java.util.HashSet;

public class EmployeeManager{

    private ArrayList<Employee> employees = new ArrayList<>();
    private HashSet<Integer> employeeIDs = new HashSet<Integer>();

    public void AddEmployee(Employee employee){
        if (!employeeIDs.contains(employee.getEmployeeId())) {
            employees.add(employee);
            employeeIDs.add(employee.getEmployeeId());
        } else {
            System.out.format("\nThe ID %d is already registered!\n", employee.getEmployeeId());
        }
    }

    public void DisplayAllEmployeeAndRoles(){
        for (Employee employee : employees){
            employee.displayDetails();
            System.out.println();
        }
    }

    public void UpdateEmployeeSalary(int employeeId, double newSalary){
        if (employeeIDs.contains(employeeId)) {
            for (Employee employee : employees){
                if(employee.getEmployeeId() == employeeId){
                    employee.setSalary(newSalary);
                    System.out.println("The salary was updated for the employee with ID: " + employeeId);
                }
            }
        } else {
            System.out.format("\nThe ID %d is not registered!\n", employeeId);
        }
    }

    public void DisplayEmployeeDetailsAndBonus(int employeeId){
        for(Employee employee : employees){
            if (employee.getEmployeeId() == employeeId){
                employee.displayDetails();
                break;
            }
        }
    }
}


