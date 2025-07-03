package Ex_18_OOPs;

public class Lab111_Cats {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        new Cat();
        Cat c2;

        c1.running();
        //c2.running();->object is not created it is only reference od cat c2
        new Cat().running();
    }
}

class Cat{
    String name;

    void running(){
        System.out.println("Running");
    }
}