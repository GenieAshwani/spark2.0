package oops;


class Shape{
    void draw()
    {
        System.out.println("Drawing shape....");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle....");
    }
}

class Rectangle extends Shape{
    @Override
    void draw() {
        System.out.println("Drawing Rectangle...");
    }
}
public class OverridingDemo {

    public static void main(String[] args) {
        Shape shape=new Shape();
        shape.draw();

        Circle circle=new Circle();
        circle.draw();

        Rectangle rectangle=new Rectangle();
        rectangle.draw();

        Shape shape1=new Circle();
        shape1.draw();

    }
}
