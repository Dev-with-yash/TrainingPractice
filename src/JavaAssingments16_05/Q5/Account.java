package JavaAssingments16_05.Q5;

public abstract class Account
{
    public void withdraw(){
        System.out.println("amount with draw");
    }
    public void deposit(){
        System.out.println("amount deposited");
    }
    public abstract void interest();
}
