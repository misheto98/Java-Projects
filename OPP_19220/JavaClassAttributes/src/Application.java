public class Application {
    public static void main(String[] args) {
        Students stud_01 = new Students();
        Students stud_02 = new Students();

        stud_02.setFirstName("Mihayl");
        stud_02.setLastName("Mihaylov");
        stud_02.setCourseName(19308);

        Students stud_03= new Students("Mihaela","Dilqnova",19220);

        Students stud_04 = new Students("Miroslav","Vasil",19305);
        Students stud_05 = new Students("Miroslava","Ilieva",19519);


        System.out.println("First name:"+ stud_01.getFirstName()+ " " +"Last name:"+ stud_01.getLastName()+ " " + "Number:"+stud_01.getCourseName());
        System.out.println("First name:"+ stud_02.getFirstName()+ " " +"Last name:"+stud_02.getLastName()+ " " +"Number:"+stud_02.getCourseName());
        System.out.println("First name:"+ stud_03.getFirstName()+ " " +"Last name:"+stud_03.getLastName()+ " " +"Number:"+stud_03.getCourseName());
        System.out.println("First name:"+ stud_04.getFirstName()+ " " + "Last name:"+stud_04.getLastName()+" "+ "Number:"+stud_04.getCourseName());
        System.out.println("First name:"+ stud_05.getFirstName()+ " " +"Last name:"+stud_05.getLastName()+" "+ "Number:"+stud_05.getCourseName());





    }
}



