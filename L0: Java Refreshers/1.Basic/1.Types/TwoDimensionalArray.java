import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] matrix = new int[2][3];

        matrix[0][0] = 1;
        matrix[0][1] = 2;

        matrix[1][0] = 3;
        matrix[1][1] = 4;

        System.out.println(Arrays.deepToString(matrix));
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);

    }
}
