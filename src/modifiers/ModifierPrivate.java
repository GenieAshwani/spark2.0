package modifiers;


class PrivateModifier{
    private String name="ashwani"; //private
    private String account="12213e23232";
    public String pass="@89898";
    private void display(){
        System.out.println("Hello "+name);
    }

    public String getName() {
        return name;
    }

    public void getBalance()
    {
        System.out.println("account = "+account);
        System.out.println("pass = "+pass);
    }

}
public class ModifierPrivate {

    public static void main(String[] args) {
        PrivateModifier privateModifier=new PrivateModifier();
        System.out.println(privateModifier.getName());
        System.out.println(privateModifier.getName());

        privateModifier.getBalance();
        privateModifier.pass="jadu";
        privateModifier.getBalance();

    }
}
