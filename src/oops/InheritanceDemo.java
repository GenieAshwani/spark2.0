package oops;
class Car
{
    int a=10;
    public void horn()
    {
        System.out.println("pepe pepe");
    }
}

class Creta extends Car{

    public void horn()
    {
        System.out.println("pooo pooo");
    }
    public void engine()
    {
        System.out.println("1450");
    }

}
public class InheritanceDemo {

    public static void main(String[] args) {

        Creta creta=new Creta();
        creta.horn();
        //System.out.println(creta.a);

        Car car=new Car();
        car.horn();

        Car car1=new Creta();//
        car1.horn();

        //Creata creata1=new Car();
    }
}
