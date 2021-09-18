import java.util.Date;

public class Types {
    public static void main(String[] args) {
        byte age = 25;
        int viewsCount = 123_456_789;
        long wordPopulation = 7_000_000_000L;
        double price = 10.99;
        float value = 10.99F;
        char letter = 'A';
        boolean isEligible = false;

        Date now = new Date();

        System.out.println("All the outputs:");

        System.out.println("Primitive data types:");
        System.out.println(age);
        System.out.println(viewsCount);
        System.out.println(wordPopulation);
        System.out.println(price);
        System.out.println(value);
        System.out.println(letter);
        System.out.println(isEligible);

        System.out.println("Referenced data types:");
        System.out.println(now);

    }
}

// ___Primitive types_____
// - byte
// - short
// - int
// - long
// - float
// - double
// - char
// - boolean

// _____Referenced Types______
// e.g. Date
