public class Cat {
    String name = "Puhi";
    int age= 2;
    int length =160;
    boolean isMale = false;

    public static void main(String[] args) {
        Cat cat;
        cat = new Cat();

        System.out.println("Cat's name is: " + cat.name);
        System.out.println("Cat's age is: " + cat.age);
        System.out.println("Cat's length is: " +cat.length);
        System.out.println("Cat's is male: " + cat.isMale);
    }
}
