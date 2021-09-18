public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public int calCulateWage(int extraHours) {
        return baseSalary + hourlyRate * extraHours;
    }

    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0) {
            throw new IllegalArgumentException("Salary must be greater than 0.");
        } else {
            this.baseSalary = baseSalary;
        }
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0) {
            throw new IllegalArgumentException("HOurly rate  must be greater than 0.");
        } else {
            this.hourlyRate = hourlyRate;
        }
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

}