
//Create objects inside the same class
public class Lamp1 {
    boolean isOn; // return true and false if the light is on or off

    //create method to turn on the light
    void turnOn() {
        isOn = true;
        System.out.println("Light on ?" + isOn);
    }

    public static void main(String[] args) {

        //create objects
        Lamp1 ledLamp = new Lamp1();


        //calling method on object
        ledLamp.turnOn();

    }

}



