class InterClass implements Interest,Shape{
    public void calculateInterest() {
        float p = 10000 * r * 5;
        System.out.println("Principle Amount modified : " + p);
    }
    public void calculateAmount(){
        float si = 250;
        float t = 2;
        float A = (si/ (t * r)) * 100;
        System.out.println(A);
    }
    public void display(){
        System.out.println("display circle");
    }
}


public class InterfaceDemo {
    public static void main(String[] args) {
        //inter1 i1 = new inter1();
        Interest i1 = new InterClass();
        i1.calculateInterest();
        Shape s = new InterClass();
        i1.calculateAmount();
        s.display();
    }

}