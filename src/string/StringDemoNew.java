package string;

public class StringDemoNew {
    public static void main(String[] args) {
        String s1=new String("hello");
        String s2="hey";
        System.out.println(s1==s2);
        String s3="hey";
        System.out.println(s2==s3);
        System.out.println(s1.equals(s2));

        char ch[]={'a','b','c'};
        String s7=new String(ch);
        System.out.println(s7);

        //== reference
        //equals==content

    }
}
