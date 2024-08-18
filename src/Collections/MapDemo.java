package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("one",1);
        map.put("two",1);
        map.put("three",3);
        map.put("one",10);

        System.out.println(map);


    }
}
