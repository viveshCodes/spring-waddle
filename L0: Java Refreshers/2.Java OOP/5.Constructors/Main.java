public class Main {
    public static void main(String[] args) {

        var employee1 = new Employee(50_000, 1_000);
        int salary1 = employee1.calCulateWage(12);
        System.out.println("Salary1:" + salary1);

        var employee2 = new Employee(50_000);
        int salary2 = employee2.calCulateWage();
        System.out.println("Salary2:" + salary2);

        var employee3 = new Employee(50_000, 1_000);
        int salary3 = employee3.calCulateWage(12);
        System.out.println("Salary3:" + salary3);

        var employee4 = new Employee(50_000, 1_000);
        int salary4 = employee4.calCulateWage();
        System.out.println("Salary4:" + salary4);

    }
}
