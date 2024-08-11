package exception;

public class ExceptionDemo2 {
    public static void main(String[] args)  {
        int arr[]=new int[5];
        int res=-1;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=i;
        }
        try {
            res=arr[1]/0;  //primary logic
        }
        catch (ArithmeticException e)
        {
            //hadling code
            res=100;  //secondary logic

        }

        System.out.println(res);
    }
}
