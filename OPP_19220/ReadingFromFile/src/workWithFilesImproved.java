import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

import java.util.Scanner;

class workWithFilesImproved{
    public static void main(String[] args) {

        System.out.println(">>>ЗАДАВАНЕ НА ИМЕ:>>>");

        Scanner input = new Scanner(System.in);
        System.out.println("Input File name:");
        String fieName = "C:\\Users\\Mihaela\\IdeaProjects\\OPP_19220\\Tema08\\fileName.txt";


        System.out.println("СЪЗДАВАНЕ:");
        File myFile = null;

        try{
            myFile = null;
            myFile = new File(fieName);

            if(myFile.createNewFile()){
                System.out.println("File created:");
            }else{
                System.out.println("File already exists.");
            }
        }
        catch (IOException e ){
            System.out.println("An error occurred.");
            System.out.println("Check File Name!");

           e.printStackTrace();

            System.out.println("Може ли да четем и пишем?");
            System.out.println("Can Read?:"+myFile.canRead());
            System.out.println("Can Write?:"+myFile.canWrite());


            System.out.println("ПИСАНЕ");

            try{
                FileWriter myWriter = new FileWriter(myFile);
                myWriter.write("Работа с файлове под JAVA - сладкаа рбота...!\n");
                myWriter.write("ДАЛИ?\n");


                myWriter.append("Това трябва да е на следващия ред\n");
                myWriter.append("Това да го има също\n");
                myWriter.append("Това пък за какво ли ни е \n");
                myWriter.append("Това е за довиждане\n");

                myWriter.close();
                System.out.println("Successfully wrote to this file.");
            }
            catch (IOException e1) {
                System.out.println("Check File NAme!");

              e1.printStackTrace();

            }

            System.out.println("READ//SCANNER::;");
            Scanner myReader1 = new Scanner(System.in);

            try{
                myReader1 = new Scanner(myFile);
                while(myReader1.hasNextLine()){
                    String data = myReader1.nextLine();
                    System.out.println(data);
                }
                myReader1.close();

            }
            catch (FileNotFoundException e1)  {
                System.out.println("Check File Name!");

               e1.printStackTrace();

            }
            System.out.println("Четене//FileReader/:");
            System.out.println("Четенето с FileReader става симвил по символ///");

            FileReader myReader2 = null;
            try{
                myReader2 = new FileReader(myFile);
                int i;
                while((i=myReader2.read())!= -1){
                    System.out.println((char)i);
                    myReader2.close();

                }


            }
            catch ( IOException e1)  {
                System.out.println("Check File Name!");

              e1.printStackTrace();

            }

            System.out.println("РАЗПЕЯАТВАНЕ НА ИНФОРМАЦИЯ:");

            if(myFile.exists()) {
                System.out.println("File name:"+myFile.getName());
                System.out.println("Absolute path:"+myFile.getAbsolutePath());
                System.out.println("Writeable:"+myFile.canWrite());
                System.out.println("Readable:"+myFile.canRead());
                System.out.println("File size in bytes"+myFile.length());

            }else{
                System.out.println("The file does not exist.");
            }

            System.out.println("ИЗТРИВАНЕ:");

            myFile.delete();
            System.out.println("Exist?:"+myFile.exists());

            System.out.println("НУЛИРАНЕ:");

            myFile = null;
             try{
                 System.out.println("File name"+myFile.getName());
             }
             catch (Exception e1)    {
                 System.out.println("NO such file or directory!");

                e1.printStackTrace();

             }

            System.out.println("РАЗПЕЧАТВАНЕ НА ИНФОРМАЦИЯТА:");
             try{
                 if(myFile.exists()){
                     System.out.println("File name"+myFile.getName());
                     System.out.println("Absolute path:"+myFile.getAbsolutePath());
                     System.out.println("Writeable:"+myFile.canWrite());
                     System.out.println("Readable:"+myFile.canRead());
                     System.out.println("File size in bytes"+myFile.length());

                 }else{
                     System.out.println("THe file not exist.");
                 }

             }
             catch (Exception e1) {
                 System.out.println("No such file or directory!");

             }

        }

    }


}

