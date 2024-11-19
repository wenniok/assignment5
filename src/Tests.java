public class Tests {
    public static void main(String[] args){
        EmployeeManager employeeManager = new EmployeeManager();

        // add an employee full-time
        System.out.println("Add Wennio as Full-Time");
        employeeManager.AddEmployee(new FullTimeEmployee("Wennio", 123, 12000.00));
        System.out.println("Add Hevellyn as Full-Time");
        employeeManager.AddEmployee(new FullTimeEmployee("Hevellyn", 321, 6000.00));

        // add an employee part-time
        System.out.println("Add Marley as Part-Time");
        employeeManager.AddEmployee(new PartTimeEmployee("Marley", 2020, 3000.00));
        System.out.println("Add Yoda as Part-Time");
        employeeManager.AddEmployee(new PartTimeEmployee("Yoda", 2610, 3000.00));

        // show all employee
        System.out.println("Show all employess previously added");
        employeeManager.DisplayAllEmployeeAndRoles();

        // update the salary
        System.out.println("Update Hevellyn Full-Time salary");
        employeeManager.UpdateEmployeeSalary(321, 7000.00);
        System.out.println("Update Yoda Part-Time salary");
        employeeManager.UpdateEmployeeSalary(2610, 4000.00);

        // show only one employee using the employeeId
        System.out.println("Show Hevellyn Full-Time new salary");
        employeeManager.DisplayEmployeeDetailsAndBonus(321);
        System.out.println("Show Yoda Part-Time new salary");
        employeeManager.DisplayEmployeeDetailsAndBonus(2610);
    }
}
