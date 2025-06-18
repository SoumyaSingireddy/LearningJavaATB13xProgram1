package ex_06_Ternary_Operator;

public class Lab049_Real_Age_Classification {
    public static void main(String[] args) {
        // age = 23
        //age < 18 ->Minor
        // age > 18 ->Adult
        // age > 65 ->Senior Citizen
        //when there are multiple conditions we use nested ternary operations

        int age = 79;
        String result = (age <18) ? "Minor" : (age < 65 ? "Adult" : "Senior");
        System.out.println(result);
    }
}
