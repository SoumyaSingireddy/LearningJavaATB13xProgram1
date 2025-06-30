package Ex_16_StringBuilder_StringBuffer;

public class Lab098_StringBuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Soumya");
        stringBuffer.append("Reddy");
        System.out.println(stringBuffer);

        System.out.println(stringBuffer.reverse());

        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1+s2;
        System.out.println(s3);
        System.out.println(s1);
    }
}
