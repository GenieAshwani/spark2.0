package exception;

class FinallyTest{
    int m1()
    {
        try {
            System.out.println(10/0);
            System.out.println("try block executed");
            return 999;
        }
        catch (ArithmeticException e)
        {
            System.out.println("catch block executed");
            System.exit(0);
            return 222;
        }
        finally {
            System.out.println("finally block executed");
            return 888;
        }

    }
}
public class FinallyDemo2 {
    public static void main(String[] args) {
        FinallyTest finallyTest=new FinallyTest();
        int res = finallyTest.m1();
        System.out.println(res);
    }
}
