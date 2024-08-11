package protectedTest;

import modifiers.ModifierProtected;
import modifiers.ModifierPublic;

public class ProtectedTest extends ModifierProtected {

    public static void main(String[] args) {
        ProtectedTest protectedTest=new ProtectedTest();
        System.out.println(protectedTest.name);
        protectedTest.display();

        ModifierPublic modifierPublic=new ModifierPublic();
        modifierPublic.display();
    }
}


