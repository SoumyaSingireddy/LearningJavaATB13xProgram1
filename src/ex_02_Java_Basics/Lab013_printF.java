package ex_02_Java_Basics;

public class Lab013_printF {
    public static void main(String[] args) {
        int a= 10;
        System.out.print("print command print without the new line");
        System.out.println("Hello World");
        System.out.println("add the new line in the end");

        System.out.println(a);
        System.out.printf("Your variable name is %d" ,a);

        int b=20;
        System.out.println("___");
        System.out.printf("%d * %d",a,b);
    }
}
