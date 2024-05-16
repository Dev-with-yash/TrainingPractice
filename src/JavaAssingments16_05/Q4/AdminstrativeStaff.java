package JavaAssingments16_05.Q4;

public class AdminstrativeStaff extends Staff{

    public AdminstrativeStaff(String name, int age, int mobile_number)
    {
        super(name, age, mobile_number);
    }

    public void responsibilities(){
        System.out.println(" Administrate : maintaining records, funds.. school administration");
    }
}
