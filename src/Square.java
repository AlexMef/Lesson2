public class Square implements Shape{
    private int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public void draw() {
        System.out.println("Нарисован квадрат");
    }

    @Override
    public double getPerimeter() {
        return sideLength*4;
    }

    @Override
    public double getArea() {
        return Math.pow(sideLength, 2);
    }
}
