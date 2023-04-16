public class Students {
    public String name;
    public String family;
    public int number;
    public Scores studentScores;


    public Students(String name,String family , int number) {
        this.family = family;
        this.name = name;
        this.number=number;

    }
    public void printInfo(){
        System.out.println("Student Info:");
        System.out.println("-----------------------");
        System.out.println("Name:"+ this.name);
        System.out.println("family:"+this.family);
        System.out.println("Course number:"+this.number);
        System.out.println("Average Score"+this.studentScores.averageScore() );
        System.out.println("-------------------------");




    }


}
