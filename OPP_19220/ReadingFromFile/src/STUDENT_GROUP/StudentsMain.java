package STUDENT_GROUP;

import java.io.FileNotFoundException;
import static  STUDENT_GROUP.StudentsMethods.*;



public class StudentsMain {


    // MAIN =============================================================================
    public static void main(String[] args) throws FileNotFoundException {

        // МЕТОДИ ЗА ЧЕТЕНЕ И АНАЛИЗ НА ДАННИТЕ - НАМИРАТ СЕ В Students_Methods.java
        MakeStatistic( ReadAndSplitFromFile("C:\\Users\\Mihaela\\Desktop\\indexFile.txt") );

    }// END OF MAIN ======================================================================


}







