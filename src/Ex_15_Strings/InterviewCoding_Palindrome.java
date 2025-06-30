package Ex_15_Strings;

import javax.xml.transform.Source;
import java.util.Scanner;

public class InterviewCoding_Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = scanner.next();
        String newString_reversed = reverseString(input);

        if(newString_reversed.equalsIgnoreCase(input)) {
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

    }

    static String reverseString(String userInput){
        String reversed = " ";
        for (int i = userInput.length()-1; i >= 0; i--){
            reversed = reversed+ userInput.charAt(i);
        }
        return reversed;
    }
}
