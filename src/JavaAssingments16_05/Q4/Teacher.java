package JavaAssingments16_05.Q4;

public class Teacher extends Staff {


    public Teacher(String name, int age, int mobile_number) {
        super(name,age,mobile_number);
    }

    public void responsibilities(){
        System.out.println("Teacher : Teaching the lessons");
    }
}
