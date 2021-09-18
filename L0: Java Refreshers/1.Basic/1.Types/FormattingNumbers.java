import java.text.NumberFormat;

public class FormattingNumbers {
    public static void main(String[] args) {
        // NumberFormat is an abstract class. So we can't create its instance using
        // `new` keyword.
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String currencyResult = currency.format(123456.897);
        System.out.println(currencyResult);

        NumberFormat percent = NumberFormat.getPercentInstance();
        String percentResult = percent.format(0.97);
        System.out.println(percentResult);
    }
}