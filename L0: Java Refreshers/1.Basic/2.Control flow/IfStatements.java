public class IfStatements {
    public static void main(String[] args) {
        int temperature = 35;

        if (temperature >= 30) {
            System.out.println("Drink more water.");
        } else if (temperature < 30 && temperature >= 20) {
            System.out.println("It's chilled weather");
        } else {
            System.out.println("It's cold.");
        }
    }
}
