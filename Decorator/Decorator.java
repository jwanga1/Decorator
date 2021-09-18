public abstract class Decorator implements Widget {
    public Widget widget;
    public Textfield textfield;

    public Decorator(Widget widget){
        this.widget = widget;
    }

    public void draw() {
        widget.draw();
    }
}
