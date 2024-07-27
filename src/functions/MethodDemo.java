package functions;


class Student
{
    public void study()
    {
        System.out.println("Study");
    }

    public int sum(int a,int b)
    {
        int c=a+b;
        return c;
    }
    public String userName()
    {
        return "Kali das";
    }

}
public class MethodDemo {
    public static void main(String[] args) {
        Student student=new Student();
        student.study();
        System.out.println(student.sum(10,10));
        int res =student.sum(10,10);
        System.out.println(res);
        String name=student.userName();
        System.out.println(name);


    }
}
