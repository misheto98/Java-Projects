public class App {
    public static void main(String[] args) {

        System.out.println("\n person1:");
        Person person1 = null;
        try{
            person1 = new Person("Daniel",17);
            System.out.println("Everything is fine!");
            System.out.println(person1);

        }catch (InvalidCredentialsException e){
            System.out.println(e.getMessageEmail());
        }

        System.out.println("\n person2:");
        Person person2 = null;

        try{
            person2 = new Person("",101,"@");
            System.out.println(person2);

        }catch (InvalidCredentialsException e){
            System.out.println(e.getMessageName());
        }

        System.out.println("\n person3:");
        Person person3 = null;

        try{
            person3 = new Person("Mikaela",101,"@");
            System.out.println(person3);

        }catch (InvalidCredentialsException e){
            System.out.println(e.getMessageAge());
        }

        System.out.println("\n person4:");
        Person person4 = null;

        try{
            person4 = new Person("Mimi ",18,"mimi@abv.bg");
            System.out.println("Everything is right!");
            System.out.println(person4);

        }catch (InvalidCredentialsException e){
            System.out.println(e.getMessage());
        }

    }
}
