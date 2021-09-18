public abstract class UIControl {
    private boolean isEnabled = true;

    // For Polymorphism
    // public void render() {

    // }

    public abstract void render();

    public void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}
