package Collections;

import java.util.Enumeration;
import java.util.Vector;
public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector();
        vector.addElement(90);
        vector.addElement(10);
        vector.addElement(20);
        vector.addElement(30);

        System.out.println(vector);
        Enumeration elements = vector.elements();
        while(elements.hasMoreElements())
        {
            Integer data = (Integer) elements.nextElement();
            System.out.println(data);
        }
    }
}
