package Collections;


import java.util.Comparator;
import java.util.TreeSet;

class UserComparator implements Comparator
{
    @Override
    public int compare(Object o1, Object o2) {
        Integer data1=(Integer) o1;
        Integer data2=(Integer) o2;
        if(data1>data2) return -1;
        else if(data1<data2) return +1;
        else return 0;
    }
}
public class ComparatorDemo {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet =new TreeSet<>(new UserComparator());
        //treeSet.add(null);
        treeSet.add(10);
        treeSet.add(50);
        treeSet.add(30);
        treeSet.add(1);
        System.out.println(treeSet);
    }

}
