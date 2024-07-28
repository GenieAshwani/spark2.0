package TypeCasting;

public class CastingDemo {

    public static void main(String[] args) {
        int a=10; // 4
        System.out.println("The integer value : "+a);

        //converting int type to double
        double data=a; // 8

        float d=10.9f;
        int k=(int)d;
        long l=122;
        int f=(int)l;
        System.out.println("The double value: "+data);


        double num =10.99;
        System.out.println("The double value: "+num);

        //converting double into int
        int b =(int) num;
        System.out.println("The Integer value : "+b);

    }
}
