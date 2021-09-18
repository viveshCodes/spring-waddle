public class TextBox extends UIControl {

    private String text = "";

    // Override render method
    @Override
    public void render() {
        System.out.println("Render text box");
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
