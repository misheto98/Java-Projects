public class Car {

    int modelYear;
    String modelName;
    String color;
    int ph;

    //Constructor NO parameters

    public Car(){
        this(1999,"Nisan","black",100);
    }

    //Constructor with one parameter
    public Car(int modelYear){
        this(modelYear,"Golf","red",101);

    }

    //Constructor with two parameters

    public Car(int modelYear, String modelName){
        this(modelYear,modelName,"white",90);
    }

    //Constructor with three parameters

    public Car(int modelYear, String modelName, String color){
        this(modelYear,modelName,color,340);
    }

    //Construct with three parameters

    public Car(int modelYear, String modelName, int ph){
        this(modelYear,modelName,"green",170);
    }

    //Constructor with four parameters
    public Car(int modelYear, String modelName, String color, int ph) {
        this.modelYear = modelYear;
        this.modelName = modelName;
        this.color = color;
        this.ph = ph;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelYear=" + modelYear +
                ", modelName='" + modelName + '\'' +
                ", color='" + color + '\'' +
                ", ph=" + ph +
                '}';
    }
}
