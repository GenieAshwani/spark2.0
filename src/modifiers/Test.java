

package modifiers;


class ModifierDefault {
    String name = "ashwani";  //default modifier

    void display() {  //default modifier
        System.out.println("Hello " + name);
    }
}
public class Test {
    public static void main(String[] args) {
        ModifierDefault modifierDefault=new ModifierDefault();
        modifierDefault.display();
        System.out.println(modifierDefault.name);
    }
}
