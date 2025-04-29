package exercise.task2;

public class Rectangle extends Shape{
    double width; // 幅
    double height; // 高さ

    // コンストラクタ
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        double rectangleArea = width * height;
        return rectangleArea;
    }
}
