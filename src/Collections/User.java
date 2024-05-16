package Collections;



import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.Map;

public class User {

    public static TreeMap<Integer, String> display(int n,
                                                   HashMap<Integer, Integer> h) {
        // write your code here
        TreeMap<Integer,String> hm = new TreeMap<>();
        for(Map.Entry<Integer,Integer> e : h.entrySet()){
            if (e.getValue() >= 80){

                hm.put(e.getKey(),"GOLD");

            }
            else if (e.getValue()<80 && e.getValue()>=60){
                hm.put(e.getKey(),"SILVER");
            }
            else if (e.getValue()<60 && e.getValue()>=45){
                hm.put(e.getKey(),"BRONZE");
            }
            else{
                hm.put(e.getKey(),"FAIL");
            }
        }

        return hm;
    }

}
