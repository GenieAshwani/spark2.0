package functions;

import java.util.Scanner;

class AdditionNum{
    int sum(int a,int b)
    {
        int c = a+b;
        return c;
    }

    void display()
    {
        int a=10;
        int b=10;
        System.out.println(a+b);
        System.out.println("Hello genie ashwani");
    }
}



public class FunctionDemo {

    public static void main(String[] args) {

        AdditionNum additionNum = new AdditionNum();
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the first value:");
        int a=scanner.nextInt();
        System.out.println("Enter the second value:");
        int b=scanner.nextInt();

        int res= additionNum.sum(a,b);
        System.out.println(res);
        additionNum.display();
    }
}
