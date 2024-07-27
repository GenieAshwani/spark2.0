package constructor;


class Monkey{
    public void sound()
    {
        System.out.println("kho kho");
    }
}


class Animal
{
    Monkey monkey;
    public void m1()
    {
        System.out.println("m1");
    }
    public void sound()
    {
        monkey.sound();
    }

    //how to create custom cons
    Animal(int b)
    {

    }
}
public class Demo {
    public static void main(String[] args) {
        //default
        Animal a=new Animal(1);
        a.m1();
        a.sound();
    }
}
