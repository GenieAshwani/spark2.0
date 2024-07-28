package staticDemo;


class Test{
    static int a=10; //static variable
    int b=20;
    public void display()
    {
        System.out.println(a);
    }
}
public class staticDemo {
    public static void main(String[] args) {
        Test t1=new Test();
        Test t2=new Test();
        Test t3=new Test();
        t1.a =100;  //100
        t2.a=200;   //200
        t3.a=500;   //500

        System.out.println(t1.a); //500
        System.out.println(t2.a); //500
        System.out.println(t3.a); //500

        System.out.println("--------------------------------------------");
        t1.b=100;
        t2.b=7;
        t3.b=25;
        System.out.println(t1.b); //100
        System.out.println(t2.b); //7
        System.out.println(t3.b); //25

        System.out.println(StaticTest.BO_DB_01);
        boolean emptyOrNull = StaticTest.isEmptyOrNull("");
        System.out.println(emptyOrNull);

    }
}
