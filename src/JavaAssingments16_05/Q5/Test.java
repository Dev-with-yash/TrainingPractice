package JavaAssingments16_05.Q5;

public class Test {
    public static void main(String[] args) {
        Account s = new Savings();
        s.interest();
        Account c = new Current();
        c.interest();
        Account f = new FixedDeposit();
        f.interest();

    }
}
