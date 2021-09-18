import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name:");
        String name = scanner.nextLine();

        System.out.print("Age:");
        byte age = scanner.nextByte();

        System.out.print("Phone:");
        long phone = scanner.nextLong();

        System.out.print("Grade:");
        String grade = scanner.next();

        System.out.print("cgpa:");
        float cgpa = scanner.nextFloat();

        scanner.close();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
        System.out.println("Grade: " + grade);
        System.out.println("cgpa: " + cgpa);

    }
}

// There's no next method for 'char'.