package task9.objects;

public class Shapes {
   private int lengthSide1;
   private int lengthSide2;
   private String typeOfShape;
  private double area;
   private double perimeter;

    public Shapes(int lengthSide1, int lengthSide2, String typeOfShape){
        this.lengthSide1 = lengthSide1;
        this.lengthSide2 = lengthSide2;
        this.typeOfShape = typeOfShape;

    }

    public Shapes(int lengthSide1, String typeOfShape){
        this.lengthSide1 = lengthSide1;
        this.typeOfShape = typeOfShape;
    }

    public void area(){}
    public void perimeter(){}
    public void info(){
        System.out.println(typeOfShape);
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }

    public int getLengthSide1() {
        return lengthSide1;
    }

    public void setLengthSide1(int lengthSide1) {
        this.lengthSide1 = lengthSide1;
    }

    public int getLengthSide2() {
        return lengthSide2;
    }

    public void setLengthSide2(int lengthSide2) {
        this.lengthSide2 = lengthSide2;
    }

    public String getTypeOfShape() {
        return typeOfShape;
    }

    public void setTypeOfShape(String typeOfShape) {
        this.typeOfShape = typeOfShape;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
}
