import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.println(numbers[0]);
        String numbersInStringForm = Arrays.toString(numbers);
        System.out.println(numbersInStringForm);

        int[] wholeNumbers = { 0, 1, 2, 3, 4 };
        System.out.println(wholeNumbers.length);
    }
}
