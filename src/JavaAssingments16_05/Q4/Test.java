package JavaAssingments16_05.Q4;

public class Test {
    public static void main(String[] args) {
        AdminstrativeStaff a = new AdminstrativeStaff("kiran", 29, 842908495);
        a.responsibilities();
        SupportiveStaff s = new SupportiveStaff("praveen", 23, 428903483);
        s.responsibilities();
        Teacher t = new Teacher("anil", 40, 89520983);
        t.responsibilities();
    }
}
