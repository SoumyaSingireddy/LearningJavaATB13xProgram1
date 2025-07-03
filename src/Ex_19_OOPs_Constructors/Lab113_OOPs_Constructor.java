package Ex_19_OOPs_Constructors;

public class Lab113_OOPs_Constructor {
    public static void main(String[] args) {
        Baby b1 = new Baby();
    }



}
class Baby{
    String name;

    Baby(){
        System.out.println("I am called,Default Constructor");
        System.out.println("Your Aadhar number is Ready!");
    }

    //Behaviour
    void cry(){
        System.out.println("Cry!");
    }
    void sleep(){
        System.out.println("sleep");
    }
    void eat(){
        System.out.println("Eat!!");
    }
}