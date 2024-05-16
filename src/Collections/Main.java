package Collections;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

import static Collections.User.display;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        Scanner sc = new Scanner(System.in);
        // Write your code here
        int n = sc.nextInt();
        HashMap<Integer,Integer> h = new HashMap<>();
        for (int i=0; i<n; i++){
            h.put(sc.nextInt(),sc.nextInt());
        }

        TreeMap<Integer,String> tm = display(n,h);
        for(Integer key : tm.keySet()){
            System.out.println(key);
            System.out.println(tm.get(key));
        }
    }

}
