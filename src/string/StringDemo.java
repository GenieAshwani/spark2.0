package string;


public class StringDemo {
    public static void main(String[] args) {

        //how to create object
        //1 using string literals
        //2 using new keyword
       /* String s1=new String("hello");
        System.out.println(s1.hashCode());

        String s2="hello";
        System.out.println(s2.hashCode());*/

        String s1="hello";
        String s2="hello";
        System.out.println(s2==s1);

        String s3=new String("hey");
        String s4=new String("hey");
        System.out.println(s3==s4);
        String s5="hey";
        System.out.println(s3==s5);
        System.out.println(s3.hashCode());
        System.out.println(s5.hashCode());

        //== memory address
        //equals content
        System.out.println(s3.equals(s5));
    }
}
