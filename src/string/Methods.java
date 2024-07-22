package string;

public class Methods {
    public static void main(String[] args) {
        String s="genie Ashwani";
        System.out.println(s.length()); //length
        for (int i=0;i<s.length();i++)
        {
            System.out.print(s.charAt(i));
        }

        String s1="ashwani";
        String s2="updhyaya";
        String s3=s1+s2;
        System.out.println(s3);

        String s11="Nikita";
        System.out.println(s11.charAt(1));

        String s12="hello";
        String s13="hello";
        int res=s12.compareTo(s13);
        System.out.println(res);

        String s15="genie ashwani codeforsuccess";
        System.out.println(s15.contains("ashwani"));
        System.out.println(s15.indexOf('i'));
        System.out.println(s15.lastIndexOf('i'));
    }
}
