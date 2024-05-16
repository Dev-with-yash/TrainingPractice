package JavaAssingments16_05.Q4;

public class SupportiveStaff extends Staff{
    public SupportiveStaff(String name, int age, int mobile_number) {
        super(name, age, mobile_number);
    }
    public void responsibilities(){
        System.out.println("Supportive Staff : Maintaining the school, assisting the teachers.. ");
    }
}
