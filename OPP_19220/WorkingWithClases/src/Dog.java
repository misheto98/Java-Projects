public class Dog {
    private  String name;
    private  int   age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog() {
        this.name = "Maik";
        this.age = 5;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void bark(){
        System.out.printf("Dog %s said:Wow-wow\n",this.name);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Dog name:").append(this.getName());sb.append("\n");

        sb.append("Dog age:").append(this.getAge());sb.append("\n");

        return sb.toString();
    }
}
