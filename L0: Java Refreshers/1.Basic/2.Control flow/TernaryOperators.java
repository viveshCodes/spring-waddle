public class TernaryOperators {
    public static void main(String[] args) {
        int income = 50_000;

        String category = income > 40_000 ? "Sound" : "Difficult";
        System.out.println(category);
    }
}
