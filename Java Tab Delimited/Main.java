import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.*;

public class Main{
  /*This function reads a csv file with student data (format:age,name,school\n) and
  returns a List with each index representing a row of the file.

  It processes this information and creats a HashMap with key:unique schools and
  value: ArrayList of students at the school.

  Finally, it writes a tab delimited file for each school*/

    public static void main(String[] args) throws FileNotFoundException {

      //read file data
        CsvFileReader fileReader= new CsvFileReader();
	List rowDataList = fileReader.read("text.csv");

      //process file
        StudentDataProcessor fileProcessor = new StudentDataProcessor();
        StudentHashMap studentMap = fileProcessor.process(rowDataList);

      //write each key to seperate tab delimited file
        PrintEachKeyToTabDelimited fileWriter = new PrintEachKeyToTabDelimited();
        fileWriter.write(studentMap);
    }
}
