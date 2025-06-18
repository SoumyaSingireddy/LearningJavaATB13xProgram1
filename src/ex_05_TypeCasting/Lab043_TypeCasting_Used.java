package ex_05_TypeCasting;

public class Lab043_TypeCasting_Used {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45f;

        float total2 = course+GST;
        float total3 = (float)course+GST;
        System.out.println(total2);
        System.out.println(total3);
    }
}
