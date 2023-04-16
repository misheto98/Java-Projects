import static java.awt.Color.black;

public class Bicycle {
   //fields::
    int gears = 3;
    String color = "black";

    //constructors :: името съвпада с името на класа
    //default constructor::
    public Bicycle(){
        this.gears = 3;
        this.color = "red";
    }

    //construct with parameters ::

    //-1 parameter
    public Bicycle(int gears){
        this.gears = 6;
    }


    //-1 color
    public Bicycle(String color){
        this.color = "pink";
    }


    // -2
    public Bicycle(int gears, String color) {
        this.gears = gears;
        this.color = color;
    }

    //methods ::
    public void brake(){
        System.out.println( this.color + " " + this.gears + " is breaking...");


    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "gears=" + gears +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Bicycle myBicycle01 = new Bicycle(); // default
        Bicycle myBicycle02 = new Bicycle(9,"green");
        Bicycle myBicycle03 = new Bicycle(12); //gear
        Bicycle myBicycle04 = new Bicycle();

        System.out.println( myBicycle01);
        System.out.println( myBicycle02);
        System.out.println( myBicycle03);
        System.out.println( myBicycle04);

        myBicycle01.brake();
        myBicycle02.brake();
        myBicycle03.brake();
        myBicycle04.brake();

    }

} // end of Bicycle class



