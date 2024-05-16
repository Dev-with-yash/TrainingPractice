package JavaAssingments16_05.Q4;

public abstract class Staff {
    String name;
    int age;
    long mobile_number;

    public Staff(String name, int age, long mobile_number) {
        this.name = name;
        this.age = age;
        this.mobile_number = mobile_number;
    }

    public abstract void responsibilities();
}
