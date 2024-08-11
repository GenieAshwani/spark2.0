package exception;

public class ExceptionDmeo3 {

    public static void main(String[] args) {
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=i;
        }
        try {
            int res=arr[1];
            //throw new ArithmeticException("Request fail due tech error");
            System.out.println(10/0);
        }
      /*  catch (ArithmeticException e)
        {
            System.out.println("ArithmeticException");
            System.out.println(e.getMessage());
        }*/
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException");
            System.out.println(e.getMessage());
        }
       /* catch (Exception e)
        {
            System.out.println("i am in catch");
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }*/

    }
}
