package oops;

class TestAbs
{
    public void printEngineDetails(Vehicle vehicle){
        vehicle.engine();
    }
}
public class TestAbstract {

    public static void main(String[] args) {
        TestAbs t=new TestAbs();
        t.printEngineDetails(new Tata());
        t.printEngineDetails(new BMW());
    }
}
