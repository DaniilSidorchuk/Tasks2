package task9.objects;

public class Shapes {
   private int lengthSide1;
   private int lengthSide2;
   private String typeOfShape;
  double area;
  double perimeter;

    public Shapes(int lengthSide1, int lengthSide2, String typeOfShape){
        this.lengthSide1 = lengthSide1;
        this.lengthSide2 = lengthSide2;
        this.typeOfShape = typeOfShape;

    }

    public Shapes(int lengthSide1, String typeOfShape){
        this.lengthSide1 = lengthSide1;
        this.typeOfShape = typeOfShape;
    }

    public double area(){
        return area;
    }
    public double perimeter(){
        return perimeter;
    }
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


}
