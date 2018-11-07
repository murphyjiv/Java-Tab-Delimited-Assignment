import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentDataProcessor{
  /*Input: List of a files data with each index representing an entire row
    Output: StudentHashMap with (key:students school) and
    (values=Arraylist of students who attend the school)*/

    public StudentHashMap process(List rowDataList){
        StudentHashMap students = new StudentHashMap();

        for(int i = 0; i < rowDataList.size(); i++){
            String currLine = rowDataList.get(i).toString();
            String lineData[] = currLine.split(",");

          //line data[]: 0-id# 1-name 2-school
            Student tempStudent = new Student(Integer.parseInt(lineData[0]),lineData[1],lineData[2]);

          //add current student to Hasmap using their school (lineData[2]) as key
            students.add(lineData[2],tempStudent);
        }
        return students;
    }
}
