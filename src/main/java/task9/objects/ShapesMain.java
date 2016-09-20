package task9.objects;


public class ShapesMain {
    public static void main(String[] args) {
        Shapes [] shapes = {new Circle(50), new Rectangle(20,10)};

        shapes[0].perimeter();
        shapes[1].perimeter();
        double totalPerimeter = shapes[0].perimeter + shapes[1].perimeter;

        shapes[0].area();
        shapes[1].area();
        double totalArea = shapes[0].area + shapes[1].area;


        System.out.println(totalPerimeter);
        System.out.println(totalArea);


    }
}
