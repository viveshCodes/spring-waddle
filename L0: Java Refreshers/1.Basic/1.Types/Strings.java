public class Strings {
    public static void main(String[] args) {
        String message = "Why do we fall, Sir?";
        System.out.println(message);

        // Concatenate
        System.out.println(message + "So that we can learn to pick oursleves up.");

        // Methods
        System.out.println(message.endsWith("Sir?"));
        System.out.println(message.startsWith("Why"));
        System.out.println(message.length());
        System.out.println(message.indexOf("r"));
        System.out.println(message.replace("Sir", "Master Wayne"));
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message);

        String greeting = "  Good Morning?  ";
        System.out.println(greeting.trim());
    }
}
