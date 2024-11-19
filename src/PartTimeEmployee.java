public class PartTimeEmployee extends Employee{
    public PartTimeEmployee(String name, int employeeId, double salary) {
        super(name, employeeId, salary);
    }

    @Override
    public double calculateBonus() {
        double bonus = (super.getSalary() * 10)/100;
        return bonus;
    }

    @Override
    public void displayDetails() {
        System.out.println("Role: Part-Time Employee");
        super.displayDetails();
    }
}
