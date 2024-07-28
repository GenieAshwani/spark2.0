package staticDemo;

public class StaticTest {

    public static final String application_name="Boom.com";
    public static final String BO_DB_01="Data not found";


    public static boolean isEmptyOrNull(String str)
    {
        if(str.length()<=0) return true;
        return false;
    }

}
