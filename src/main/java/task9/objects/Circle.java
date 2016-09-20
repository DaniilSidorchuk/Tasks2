package task9.objects;


public class Circle extends Shapes {

    public  Circle(int lengthSide1){
        super(lengthSide1, "Circle");
    }

    @Override
    public void area() {
        setArea(3.14 * getLengthSide1()/2 * getLengthSide1()/2);
    }

    @Override
    public void perimeter() {
        setPerimeter(3.14 * getLengthSide1());
    }
}
