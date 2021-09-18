public class EmployeeObject {
    public static void main(String[] args) {
        var employee = new Employee();

        employee.setBaseSalary(5_000_000);
        employee.setHourlyRate(10_000);
        int wage = employee.calCulateWage(5);
        System.out.println("Total wage: " + wage);

    }

}
