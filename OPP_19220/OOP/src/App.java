import java.sql.SQLOutput;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("::::::STUDENT SCORES::::::::");


        Students stud1 = new Students("Mihaela","Mihaylova",19220);
        Students stud2 = new Students("Miroslav","Marinov",19219);
        Students stud3 = new Students("Peter","Petrov",19224);
        Students stud4 = new Students("Vasil","Vasilev",19204);
        Students stud5 = new Students("Viktor","Vasilev",19205);

       System.out.println("INPUT SCORE:");

       System.out.println("Input score for math:");
        double scoreMath = scan.nextDouble();

        System.out.println("Input score for physics:");
        double scorePhysics = scan.nextDouble();

        System.out.println("Input score for programming:");
        double scoreProgramming = scan.nextDouble();




        System.out.println("Student1:");
        System.out.println("Input score for math:");
        scoreMath = scan.nextDouble();
        System.out.println("Input score for physics:");
        scorePhysics = scan.nextDouble();
        System.out.println("Input score for programming:");
        scoreProgramming = scan.nextDouble();
        stud1.studentScores = new Scores(scoreMath,scorePhysics,scoreProgramming);



        System.out.println("Student2:");
        System.out.println("Input score for math:");
        scoreMath = scan.nextDouble();
        System.out.println("Input score for physics:");
        scorePhysics = scan.nextDouble();
        System.out.println("Input score for programming:");
        scoreProgramming = scan.nextDouble();
        stud2.studentScores = new Scores(scoreMath,scorePhysics,scoreProgramming);



        System.out.println("Student3:");
        System.out.println("Input score for math:");
        scoreMath = scan.nextDouble();
        System.out.println("Input score for physics:");
        scorePhysics = scan.nextDouble();
        System.out.println("Input score for programming:");
        scoreProgramming = scan.nextDouble();
        stud3.studentScores = new Scores(scoreMath,scorePhysics,scoreProgramming);


        System.out.println("Student4:");
        System.out.println("Input score for math:");
        scoreMath = scan.nextDouble();
        System.out.println("Input score for physics:");
        scorePhysics = scan.nextDouble();
        System.out.println("Input score for programming:");
        scoreProgramming = scan.nextDouble();
        stud4.studentScores = new Scores(scoreMath,scorePhysics,scoreProgramming);


        System.out.println("Student5:");
        System.out.println("Input score for math:");
        scoreMath = scan.nextDouble();
        System.out.println("Input score for physics:");
        scorePhysics = scan.nextDouble();
        System.out.println("Input score for programming:");
        scoreProgramming = scan.nextDouble();
        stud5.studentScores = new Scores(scoreMath,scorePhysics,scoreProgramming);


        stud1.printInfo();
        stud2.printInfo();
        stud3.printInfo();
        stud4.printInfo();
        stud5.printInfo();







    }
}
