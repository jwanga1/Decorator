public class Textfield implements Widget{
    public int width;
    public int height;

    public Textfield(int width, int height){
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.format("TextField has width:%d, and height:%d\n", width, height);
    }
}
