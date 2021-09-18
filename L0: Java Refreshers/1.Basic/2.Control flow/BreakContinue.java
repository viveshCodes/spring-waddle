public class BreakContinue {
    public static void main(String[] args) {
        System.out.println("The first 10 natural numbers except 7 are:");

        int i = 1;
        while (i <= 10) {
            if (i == 7) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }

        int[] numbers = { 1, 2, 3, 4, 5 };
        System.out.println("See if array numbers contain 3:");
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] == 3) {
                System.out.println("3 exists in the array.");
                break;
            }
        }
    }
}