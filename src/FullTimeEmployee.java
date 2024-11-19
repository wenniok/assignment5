public class FullTimeEmployee extends Employee{

    public FullTimeEmployee(String name, int employeeId, double salary) {
        super(name, employeeId, salary);
    }

    @Override
    public double calculateBonus() {
        double bonus = (super.getSalary() * 20)/100;
        return bonus;
    }

    @Override
    public void displayDetails() {
        System.out.println("Role: Full-Time Employee");
        super.displayDetails();
    }
}
