import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileWriter;
import java.io.*;

public class PrintEachKeyToTabDelimited{
  /*Input: StudentHashMap (Key:School,Values:Arraylist of students)
  Output: Tab Delimited file for each key's(schools) values (Arraylist of students)*/

    public void write(StudentHashMap HashMap){

        try{
            List keysList = HashMap.getKeys();

         /*for each key: create a file, create a header aggregate student data
         to write thefile, write file*/
            for(int i = 0; i < keysList.size(); i++){
                String currKey = (keysList.get(i).toString());

                FileWriter fw = new FileWriter(new File("results/" + currKey + "TabDelimted.csv"));

                String fileContent = currKey + " student directory\nId\tName\n"; //file header

                List currKeyValues = HashMap.getAllKeyValues(currKey);

          //for each student: add their data to the fileContent
                for(int t=0; t < currKeyValues.size(); t++){
                    fileContent += currKeyValues.get(t).toString();
                }
                fw.write(fileContent);
                fw.close();
            }
        }catch(IOException e) {
            e.printStackTrace();
        }

    }
}
