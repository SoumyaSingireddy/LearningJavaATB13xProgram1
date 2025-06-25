package ex_10_Switch;

import java.util.Scanner;

public class Lab065_Real_Switch {
    public static void main(String[] args) {
        // Web Automation
        // I will ask the user to give me the input from browser which he wants to
        //use to I will start the automation in that browser.

        // String browser = args[0];
        //System.out.println(browser);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser , which you want to strat!!");
        String browser = scanner.next();
        //browser = browser.toLowerCase();

        switch (browser){
            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println("TC1");
                System.out.println("TC2");
                break;

            case "fire fox":
                System.out.println("Starting the firefox browser");
                break;
            case "edge":
                System.out.println("Execute the Edge Code");
                break;
            default:
                System.out.println("I have no idea which brwoser is this");
                break;


        }

    }
}
