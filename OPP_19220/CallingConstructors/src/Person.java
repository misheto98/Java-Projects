public class Person {

    //create fields

    private String name;

    private int age;

    private String email;

    //Create constructor
    Person(String name, int age)  throws InvalidCredentialsException {
        setName(name);
        setAge(age);

    }

    ///Chaining constructor

    Person(String name, int age, String email) throws InvalidCredentialsException {
        this(name, age);
        this.email = email;
    }


    //GET AND SET METHODS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age)  throws InvalidCredentialsException {
        if (age < 1 || age > 100) {
            throw new InvalidCredentialsException("Age must be between 1 and 100");
        }
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setEmail(String email)  throws InvalidCredentialsException {
    if (!email.equals("@")  && !email.equals("0")) {
            throw new InvalidCredentialsException("Email must contain at least one character(@)");
        }
    this.email =email;
    }


    public String getEmail() {
        return email;
    }


    ///TO STRING

    @Override
    public String toString() {
        return "Person{" +
                "name='" + getName()+ '\'' +
                ", age=" + getAge()+
                ", email='" + getEmail() + '\'' +
                '}';
    }
}
