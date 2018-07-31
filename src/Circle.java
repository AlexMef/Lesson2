public class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Нарисована окружность");
    }

    @Override
    public double getPerimeter() {
        return radius*Math.PI*2;
    }

    @Override
    public double getArea() {
        return radius*radius*Math.PI*2;
    }
}
