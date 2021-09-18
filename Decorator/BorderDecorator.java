import java.awt.*;

public class BorderDecorator extends Decorator{

    public BorderDecorator(Widget widget){
        super(widget);
    }

    public void draw(){
        super.draw();
        System.out.println("  BorderDecorator");
    }
}
