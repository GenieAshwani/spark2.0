package modifiers;

public class ModifierPublic
{
    public String name="Nikita";
    public void display()
    {
        System.out.println("Hello "+name);
    }
}

class PublicTest {
    public static void main(String[] args) {
        ModifierPublic modifierPublic=new ModifierPublic();
        modifierPublic.display();
    }
}
