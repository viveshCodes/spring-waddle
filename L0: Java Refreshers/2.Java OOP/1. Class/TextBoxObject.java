public class TextBoxObject {
    public static void main(String[] args) {
        var textBox1 = new TextBox(); // This var is different than that in JavaScript

        textBox1.setText("Hello");
        System.out.println(textBox1.text);

        var textBox2 = new TextBox();
        textBox2.setText("Hi");
        System.out.println(textBox2.text);
        textBox2.clearText();
        System.out.println(textBox2.text);

        // Referenced
        var textBox3 = new TextBox();
        var textBox4 = textBox3;
        textBox4.setText("This is referenced.");
        System.out.println(textBox3.text);
    }
}
