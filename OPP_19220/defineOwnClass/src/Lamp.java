//Example:Java Class and Objects
public class Lamp {

    boolean isOn; // true and false ;

    // create a method to turn on the light
    void turnOn(){
        isOn=true;
        System.out.println("Light on?" + isOn);
    }

    // create a method to turn off the light
    void turnOff(){
        isOn=false;
        System.out.println("Light on?" + isOn);
    }
}

class Main{
    public static void main(String[] args) {

        //create objects
        Lamp ledLamp = new Lamp();
        Lamp halogenLamp = new Lamp();

        // calling method to turn on the light
        ledLamp.turnOn();

        //calling method to turn off the light
        halogenLamp.turnOff();
    }
}

