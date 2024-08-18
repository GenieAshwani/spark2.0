package Collections;

import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {
        TreeMap<String,Integer> treeMap=new TreeMap<>();
        treeMap.put("a",1);
        treeMap.put("c",3);
        treeMap.put("b",2);
        System.out.println(treeMap);
    }
}
