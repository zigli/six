package cf.tilgiz;

public class Circle extends Shape{
    private int x;

    @Override
    public void draw() {
        System.out.println("Круг");
        System.out.println("x = " + x);
    }
}
