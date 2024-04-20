package Day4_5.com.math.operations;

public class Multiplication {

        public int Mul(int a, int b){
            return a * b;
        }

    public static class Main {
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
}

