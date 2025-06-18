package ex_05_TypeCasting;

public class Lab041_TypeCasting_Narrowing {
    public static void main(String[] args) {
        int val = 300;
        // byte b= val; //Narrowing (int ->byte) -Implicit Casting is not allowed.

        byte b1 = (byte)val;
        //Data Loss
        System.out.println(b1);
    }
}
