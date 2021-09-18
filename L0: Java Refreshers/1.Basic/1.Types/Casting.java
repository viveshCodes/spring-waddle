public class Casting {
    public static void main(String[] args) {
        // Implicit casting: byte -> short -> int ->long -> float -> double
        short x = 1;
        int y = x + 2;
        System.out.println(y);

        double a = 1.1;
        double b = a + 2;
        System.out.println(b);

        // Explcit casting:
        double p = 2.2;
        int q = (int) p + 3;
        System.out.println(q);

        String number = "33";
        int result = Integer.parseInt(number) + 5;
        System.out.println(result);

        String decimalNumber = "3.3";
        float decimalResult = Float.parseFloat(decimalNumber) + 10;
        System.out.println(decimalResult);
    }

}
