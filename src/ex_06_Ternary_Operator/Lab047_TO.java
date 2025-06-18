package ex_06_Ternary_Operator;

public class Lab047_TO {
    public static void main(String[] args) {
        int x = 20;
        int y = 40;
        //System.out.println(Math.min(x,y));

        int min = x < y ? x : y;
        System.out.println(min);
    }
}