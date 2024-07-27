package string;

public class StringDemo3 {

    public static void main(String[] args) {
        String city=new String("Agra");
        String city1 = new String("Delhi");
        String city2=city;

        System.out.println(city1==city);  // reference com
        System.out.println(city2==city);

        String s1="Agra";
        System.out.println(city==s1);
        System.out.println(city.equals(s1)); //content com


        String s2="Arjun";
        String s3="Arjun";
        System.out.println(s3==s2);
    }
}
