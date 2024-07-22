package string;

public class StringDemo2 {
    public static void main(String[] args) {
        String s1=new String("Mudit");
        System.out.println(s1);
        s1 = s1.concat("kumar");


        String s2=new String("hello ashwani");
        System.out.println(s2);
        String s3=s2;

        StringBuffer sb=new StringBuffer("abcd");
        System.out.println(sb);
        sb=sb.append("wewe");
        System.out.println(sb);

        StringBuilder builder=new StringBuilder("sdsdd");

        //thread safe








    }
}
