public class TextBox extends UIControl {

    private String text = "";

    // Constructor inheritance
    public TextBox() {
        super(true);
        System.out.println("TextBox");
    }

    // Overiding method
    @Override
    public String toString() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clearText() {
        text = "";
    }

    public String showText() {
        return text;
    }
}
