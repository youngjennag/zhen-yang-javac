package exercise.task2;

public class Circle extends Shape{
    double radius; // 半径

    // コンストラクタ
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        double circleArea = Math.PI * radius * radius;
        return circleArea;
    }

}
