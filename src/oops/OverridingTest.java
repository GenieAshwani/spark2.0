package oops;

class TestParent
{
   static void m1()
    {
        System.out.println("parent");
    }

     void m2(){
        System.out.println("hello parent");
    }

}
class TestChild extends TestParent{
    static void m1()
    {
        System.out.println("parent");
    }

    @Override
    protected void m2() {
        super.m2();
    }
}

public class OverridingTest {
}
