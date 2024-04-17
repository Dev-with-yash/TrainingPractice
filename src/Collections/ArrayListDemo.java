package Collections;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList l = new ArrayList<>();
        l.add(504);
        l.add("yaswanth");
        l.add(24);
        l.add(1,"ponduru");
        l.remove(1);
        for(Object obj : l){
            System.out.println(obj);
        }


    }
}

