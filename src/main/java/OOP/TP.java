package OOP;
interface A{

    default void display(){

        System.out.println("Interface A display");
    }
}

interface B{

    default void display(){

        System.out.println("Interface B display");
    }
}

class C implements A, B{

    @Override
    public void display(){

        // Resolving conflict4
        display();
        System.out.println("Class C display");
    }
}

public class TP {
    public static void main(String[] args){

        C obj = new C();
        obj.display();
    }
}