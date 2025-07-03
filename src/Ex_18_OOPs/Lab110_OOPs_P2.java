package Ex_18_OOPs;

import java.sql.SQLOutput;

public class Lab110_OOPs_P2 {
    public static void main(String[] args) {
        Student S1= new Student();
        Student s2;
        new Student();

    }

}
class Student {
    String name;

    // is called as default constructor ,same name as the class name.
    Student(){
        System.out.println("DC");


}
    void sleep(){
        System.out.println("Hi");
    }
}