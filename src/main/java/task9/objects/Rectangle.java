package task9.objects;


public class Rectangle extends Shapes {


    public Rectangle(int lengthSide1, int lengthSide2) {
        super(lengthSide1, lengthSide2, "Rectangle");
    }

        @Override
        public double area (){
            return area = getLengthSide1() * getLengthSide2();
        }

        @Override
        public double perimeter() {
          return perimeter = 2 * (getLengthSide1() + getLengthSide2());
        }
    }

