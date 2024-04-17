package Day4_5;

class Shape{
    public void area(){
        System.out.println("area");
    }
}
class Rectangle extends Shape{
    public void area(){
        System.out.println("Area of Rectangle");
    }
}
class Circle extends Rectangle {
     public void area(){
         System.out.println("Area of Circle");
     }
}
public class ShapeDemo{
    public static void main(String[] args) {
        Shape c = new Circle();
        c.area();
        Shape r = new Rectangle();
        r.area();
    }
}
