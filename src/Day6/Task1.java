package Day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {

    public static List RemoveSecondElement(List args){
        args.remove(1);
        return args;
    }
    public static void main(String[] args) {
        List l = new ArrayList<>(Arrays.asList(1,2,"yaswanth",4,5,6));

        RemoveSecondElement(l);
        System.out.println(l);

    }
}
