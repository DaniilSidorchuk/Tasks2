package task9.objects;


public class Circle extends Shapes {

    public  Circle(int lengthSide1){
        super(lengthSide1, "Circle");
    }

    @Override
    public double area() {
        return area = 3.14 * getLengthSide1()/2 * getLengthSide1()/2;
    }

    @Override
    public double perimeter() {
        return perimeter = 3.14 * getLengthSide1();
    }
}
