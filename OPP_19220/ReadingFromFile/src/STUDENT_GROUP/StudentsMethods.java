package STUDENT_GROUP;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentsMethods
{


    //<editor-fold desc="ReadAndSplitFromFile">

    // METHOD : READ AND SPLIT ===========================================================
    public static Students[] ReadAndSplitFromFile(String DATA) throws FileNotFoundException {
        int counter = 0; // БРОИМ РЕДОВЕТЕ ВЪВ ФАЙЛА
        Scanner myReader = new Scanner(new File(DATA), "UTF-8");//ЧЕТЕМ ОТ ФАЙЛА

        while (myReader.hasNextLine()) {// ПРЕБРОЯВАМЕ РЕДОВЕТЕ ВЪВ ФАЙЛА
            counter++; //Увеличаваме с 1 за всеки ред
            myReader.nextLine();
        }

        Students[] StudentGroup = new Students[counter];// СЪЗДАВАМЕ МАСИВ ОТ ОБЕКТИ - КЛАСА ЗА ТЯХ Е В Students.java
        myReader.close();
        myReader= new Scanner(new File(DATA), "UTF-8");
        counter = 0; // Ще се пази индекса на масива

        while (myReader.hasNextLine()) { // FOR цикъл за попълване на масива с учениците
            String dataString = myReader.nextLine();// ЧЕТЕМ ЕДИН ПО ЕДИН РЕДОВЕТЕ
            String[] splitedData  = dataString.split(",");// сплитваме по "," (запетая) и ги слагаме в масив
            StudentGroup[counter]=new Students();
            //На всеки ученик от StudentGroup[] му задаваме число, име, фамилия, резултат като пак от splitedData[] избираме индекс
            // Четат се от файла DATA.txt;
            StudentGroup[counter].setNumber(Integer.parseInt(splitedData[0]));    // get from col Number of DATA.TXT
            StudentGroup[counter].setName(splitedData[1]);      //get from col Name of DATA.TXT
            StudentGroup[counter].setFamily(splitedData[2]);    //get from col Family of DATA.TXT
            StudentGroup[counter].setAvgscore(Double.parseDouble(splitedData[3]));  //grt from col Avgscore of DATA.TXT

            counter++; //Увеличаваме (индекса) с 1
        }

        System.out.println("FINISHING READ FROM FILE !!!");

        return StudentGroup;
    }// end of read and split ---------------------------------------

    //</editor-fold>



    //<editor-fold desc="MakeStatistic">

    // METHOD : MAKE STATISTIC ==========================================================
    // Прави статистика на успеха
    public static void MakeStatistic(Students[] StudentGroup) {

        double GroupAvgScore = 0;//Средният успех започва като 0

        // print group.................................................
        for (Students thisStudent : StudentGroup) // Чрез FOR-EACH Принтираме инф. за всеки ученик
        {
            //Взимаме име,номер, фамилия и успех
            System.out.print("Номер : " + thisStudent.getNumber());
            System.out.print(" Име : " + thisStudent.getName());
            System.out.print(" Фамилия : " + thisStudent.getFamily());
            System.out.println(" Ср.Успех : " + thisStudent.getAvgscore());
            GroupAvgScore = GroupAvgScore + thisStudent.getAvgscore();
        }
        // ПРИНТИРАМЕ ПРЕСМЕТНАТ ОБЩИЯ СРЕДЕН УСПЕХ
        System.out.println("Avarage score: " + GroupAvgScore / StudentGroup.length);


        // MAX score ....................................................
        Students max = new Students();//Приемаме че първият е отправна точка, за да го сравним с останалите

        for (Students thisStudent : StudentGroup) // FOR-EACH
        {
            //Проверяваме кой ученик е с най-висок успех
            if (max.getAvgscore() < thisStudent.getAvgscore()) {
                max = thisStudent;
            }
        }
        System.out.println("MAX SCORE : " + max.toString());
        System.out.print("Номер : " + max.getNumber());
        System.out.print(" Име : " + max.getName());
        System.out.print(" Фамилия : " + max.getFamily());
        System.out.println(" Ср.Успех : " + max.getAvgscore());


        // MIN score .......................................................
        for (Students thisStudent : StudentGroup) // FOR-EACH
        {
            if (max.getAvgscore() > thisStudent.getAvgscore()) {
                max = thisStudent;

            }
        }
        System.out.println("MIN SCORE : " + max.toString());
        System.out.print("Номер : " + max.getNumber());
        System.out.print(" Име : " + max.getName());
        System.out.print(" Фамилия : " + max.getFamily());
        System.out.println(" Ср.Успех : " + max.getAvgscore());



    } // end of Make Statistic --------------------------------------

    //</editor-fold>

}


