package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(130);
        list.add(40);
        list.add(50);
        System.out.println(list);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext())
        {
            Integer data=iterator.next();

            if(data==20)
            {
                iterator.remove();
            }
            System.out.println(data);
        }
        System.out.println(list);
        ListIterator<Integer> listIterator = list.listIterator();
        int count=0;
        while (listIterator.hasNext())
        {
            Integer next = listIterator.next();
           // System.out.println(next);
            count++;
            if(count==4)
            {
                System.out.println("2 aa gaya hai.....");
                while (listIterator.hasPrevious())
                {
                    Integer previous = listIterator.previous();
                    System.out.println(previous);
                }
            }
        }
    }
}
