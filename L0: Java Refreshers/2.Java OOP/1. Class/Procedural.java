public class Procedural {

    public static void main(String[] args) {
        int baseSalary = 50_000;
        int extraHours = 10;
        int hourlyRate = 20;

        int wage = calCulateWage(baseSalary, extraHours, hourlyRate);
        System.out.println(wage);
    }

    public static int calCulateWage(int baseSalary, int extraHours, int hourlyRate) {
        return baseSalary + 10 * 20;
    }

}
