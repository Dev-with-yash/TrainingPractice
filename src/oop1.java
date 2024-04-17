class Employee{
    int age = 21;
    String name = "yaswanth";
    void display(){
        System.out.println("Emp Name:" + name + "\n" + "Emp age:" + age);
    }
}

class ProjectHead extends Employee{
    float variablePay = 10234.4F;
    void PlDisplay(){
        System.out.println("EmplyName : "+name+"\t" + "EmplyAge : "+age+"\t"+ "Emplysalary:"+variablePay);
    }

}


public class oop1 {
    public static void main(String[] args) {
       Employee em = new Employee();
       em.display();
       ProjectHead ph = new ProjectHead();
       ph.PlDisplay();
    }
}
