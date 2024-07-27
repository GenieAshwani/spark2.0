package oops;

class SuperDad{
    int a=10;
    public void plot()
    {
        System.out.println("2000 gaj ka plot");
    }
}
 class Dad extends SuperDad{

}

class Niraj extends Dad
{

    public void name()
    {
        System.out.println("niraj");
    }
}

public class Test{
    public static void main(String[] args) {
        Niraj niraj=new Niraj();
        niraj.plot();
        System.out.println(niraj.a);
        niraj.name();
    }
}

