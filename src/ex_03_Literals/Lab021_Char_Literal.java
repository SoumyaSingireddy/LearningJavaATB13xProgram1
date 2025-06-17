package ex_03_Literals;

public class Lab021_Char_Literal {
    public static void main(String[] args) {
        char c1 = 'A' ;
        char c2 = 'B' ;
        char c3 = 'C';


        //Escape char
        char new_line = '\n' ;
        char tab_line = '\t' ;
        char back_space = '\b' ;
        char carriage_return = '\r' ;

        System.out.println("SoumyaReddy");
        System.out.println("Soumya"+new_line+"Reddy");
        System.out.println("Soumya"+tab_line+"Reddy");
        System.out.println("Soumya"+back_space+"Reddy");
        System.out.println("Soumya is young"+carriage_return+"Reddy");
    }
}
