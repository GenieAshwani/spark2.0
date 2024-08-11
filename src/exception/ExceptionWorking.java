package exception;

class ExceptionTest
{
    void print1()
    {
        print2();
        System.out.println("print 1");
    }
    void print2()
    {
            print3();
        System.out.println("print 2");
    }
    void print3()
    {
        print4();
        System.out.println("print 3");
    }
    void print4()
    {
        print5();
        System.out.println("print 4");
    }
    void print5()
    {
        try {
            System.out.println(10 / 0);
        }
        catch (Exception e)
        {
            //e.printStackTrace();
        }
    }
}
public class ExceptionWorking {
    public static void main(String[] args) {
        ExceptionTest exceptionTest=new ExceptionTest();
        exceptionTest.print1();
    }
}
