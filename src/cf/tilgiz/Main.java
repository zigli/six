package cf.tilgiz;

public class Main {

    static int z;

    public static void main(String[] args) {
        int y = 0;
        Shape circle = new Circle();
        circle.draw();
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }

}
