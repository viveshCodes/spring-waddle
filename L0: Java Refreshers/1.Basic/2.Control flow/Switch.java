import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        System.out.println("Enter your role:");
        Scanner scanner = new Scanner(System.in);
        String role = scanner.next();
        scanner.close();
        switch (role) {
            case "superadmin":
                System.out.println("You have highest authority.");
                break;
            case "admin":
                System.out.println("You have moderate authority.");
                break;
            case "user":
                System.out.println("You can access some stuffs.");
                break;
            default:
                System.out.println("No access.");
        }
    }
}
