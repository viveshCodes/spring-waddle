public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

    // Constructor Overloading
    public Employee(int baseSalary) {
        this(baseSalary, 0);
    }

    public int calCulateWage(int extraHours) {
        return baseSalary + hourlyRate * extraHours;
    }

    // Method Overloading
    public int calCulateWage() {
        return calCulateWage(0);
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0) {
            throw new IllegalArgumentException("Salary must be greater than 0.");
        } else {
            this.baseSalary = baseSalary;
        }
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0) {
            throw new IllegalArgumentException("Hourly rate  must be greater than 0.");
        } else {
            this.hourlyRate = hourlyRate;
        }
    }

}
