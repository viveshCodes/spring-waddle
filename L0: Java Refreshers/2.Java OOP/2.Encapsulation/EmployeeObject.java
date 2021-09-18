public class EmployeeObject {

    public static void main(String[] args) {
        var employee = new Employee();

        employee.setBaseSalary(50_000);
        employee.setHourlyRate(1_000);
        int wage = employee.calCulateWage(5);
        System.out.println("Total wage: " + wage);
        System.out.println("Base Salary: " + employee.getBaseSalary());
        System.out.println("Hourly Rate: " + employee.getHourlyRate());
    }

}
