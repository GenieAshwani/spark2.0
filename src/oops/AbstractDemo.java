package oops;

abstract class Vehicle{
    public abstract void engine();
    public void horn(){
        System.out.println("Pee Pee");
    }
}

class BMW extends Vehicle{
    @Override
    public void engine() {
        System.out.println("4000c Engine");
    }
    public void display(){
        System.out.println("Color red");
    }
}


class Tata extends Vehicle{
    @Override
    public void engine() {
        System.out.println("2100c Engine");
    }
}

public class AbstractDemo {

    public static void main(String[] args) {
        Vehicle vehicle1=new BMW();
        vehicle1.engine();

        Vehicle vehicle2=new Tata();
        vehicle2.engine();

    }
}
