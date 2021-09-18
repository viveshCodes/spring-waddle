public class SearchBox {
    public static void main(String[] args) {
        var search = new TextBox();

        search.disable();
        boolean canSearch = search.isEnabled();
        System.out.println(canSearch);

        search.setText("Isn't that right, Batman?");
        String text = search.showText();
        System.out.print(text);

        System.out.print(text.toString());

        var control = new UIControl(true);
        showControl(control);

        var textBox = new TextBox();
        showText(textBox);

    }

    // Upcasting
    public static void showControl(UIControl control) {
        System.out.println(control);
    }

    // Downcasting
    public static void showText(UIControl control) {
        var textBox = (TextBox) control;
        textBox.setText("A truce, Bruce?");
        System.out.println(textBox.showText());
    }
}
