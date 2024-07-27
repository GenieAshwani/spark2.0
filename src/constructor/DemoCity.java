package constructor;

class City2
{
    public void m1(){
        System.out.println("Jaipur");
    }
}

class City{

    City2 city2;
    //String cityName;
    public void m1(){
       // System.out.println(cityName);
        city2.m1();
    }

    City(City2 city2)
    {
        this.city2=city2;
    }


}


public class DemoCity {

    public static void main(String[] args) {

        City2 city2=new City2();
        City c=new City(city2); // default
        c.m1();
    }
}
