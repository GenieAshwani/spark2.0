package finalDemo;


final class finalTest{
    final void m1()
    {
        System.out.println("Hello");
    }
}
class TestFinalDemo {
    //override nhi kr payenge
    //???
}


public class FinalDemo {

    public static void main(String[] args) {
        int a=10;
        a=20;
        System.out.println(a);

        final int b=10; //valid
        final String name="Piyush";
        //b=20; //invalid
        System.out.println(b);

        TestFinalDemo t=new TestFinalDemo();

        finalTest f=new finalTest();
        f.m1();

    }

}
