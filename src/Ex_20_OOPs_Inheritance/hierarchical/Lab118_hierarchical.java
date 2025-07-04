package Ex_20_OOPs_Inheritance.hierarchical;

import Ex_20_OOPs_Inheritance.multiple_inheritance.Father_f1;

public class Lab118_hierarchical {

    public static void main(String[] args) {
        Father f1 = new Father();
        Ruhani r1 = new Ruhani();

        r1.home();
        f1.home();

        pramod p1 = new  pramod();
        p1.home();

        lucky l1 = new lucky();
        l1.l2();
        l1.home();


    }
}

class Father{
    void home(){
        System.out.println("3BHK");
    }
}

class pramod extends Father{
    void h2(){
        System.out.println("h2-Pramod");
    }
}

class lucky extends Father{
    void l2(){
        System.out.println("Lucky");
    }
}

class Ruhani extends Father{
    void r2(){
        System.out.println("Ruhani");
    }
}