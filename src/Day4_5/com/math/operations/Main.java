package Day4_5.com.math.operations;

public class Main {
    public static void main(String[] args) {
        Addition a = new Addition();
        int ares =  a.add(1,2);
        System.out.println(ares);
        Subtraction s = new Subtraction();
        int sres = s.sub(3,2);
        System.out.println(sres);
        Multiplication m = new Multiplication();
        int mres =
                m.Mul(2,3);
        System.out.println(mres);
        Division d = new Division();
        int dres = d.div(4,2);
        System.out.println(dres);
    }



}

//    Compile the Java Files: Navigate to the directory containing the com directory. Compile the Java files using the javac command:
//    javac com/math/operations/*.java
//This will create the .class files in the same directory as the Java files.
//Run the Java Files: You can run the Java files using the java command. However, you need to specify the classpath using the -cp option. If you’re in the same directory as the com directory, you can use . as the classpath:
//java -cp . com.math.operations.Addition

