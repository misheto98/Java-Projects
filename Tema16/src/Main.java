public class Main {
    public static void main(String[] args) {
        Car car01 = new Car();
        Car car02 = new Car(2005);
        Car car03 = new Car(2003,"BMW");
        Car car04 = new Car(2006,"BMW","blue");
        Car car05 = new Car(2007,"BMW",141);
        Car car06 = new Car(2008,"BMW","pink",400);

    System.out.println("ALL CARS:");
        System.out.println(car01);
        System.out.println(car02);
        System.out.println(car03);
        System.out.println(car04);
        System.out.println(car05);
        System.out.println(car06);

        System.out.println("\n");

        System.out.println("CARS06:");
        System.out.println(car06.modelYear);
        System.out.println(car06.modelName);
        System.out.println(car06.color);
        System.out.println(car06.ph);

    }
}
