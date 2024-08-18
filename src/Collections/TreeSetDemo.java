package Collections;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        TreeSet<Integer> treeSet =new TreeSet<>();
        //treeSet.add(null);
        treeSet.add(10);
        treeSet.add(50);
        treeSet.add(30);
        treeSet.add(1);

        System.out.println(treeSet);

    }
}
