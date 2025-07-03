package Ex_19_OOPs_Constructors;

public class Lab115_DC {
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1.name);
        System.out.println(c1.year);
        System.out.println(c1.model);
    }
}

class Car{
    String name;
    int year;
    String model;

    //DC
    Car(){
        name = "Unknown Car";
        year = 1993;
        model = "VDi";
    }

}
