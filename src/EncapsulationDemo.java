class User{
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}
public class EncapsulationDemo {

    public static void main(String[] args) {

        User u1 = new User();
        u1.setUserName("Yaswanth");
        u1.setPassword("Yaswanth@1234");
        System.out.println("The User Name is : " + u1.getUserName());
        System.out.println("The Password is : " + u1.getPassword());
    }

}
