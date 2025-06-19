package ex_09_If;
import java.util.Scanner;

public class Lab062_if_Else {
    public static void main(String[] args) {

        System.out.println("Enter the age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if(age <= 18){
            System.out.println("Not allowed");
        }
        else{
            System.out.println("Allowed to vote");
        }
    }
}
