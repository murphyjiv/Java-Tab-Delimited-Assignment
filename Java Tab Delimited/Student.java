import java.util.Comparator;

public class Student{
    int id;
    String name;
    String school;
    
 //constructor
    public Student(int id, String name, String school){
        this.id = id;
        this.name = name;
        this.school = school;
    }

 //How to print for tab delimited file
    @Override
    public String toString() {
        return this.id + "\t" + this.name + "\n";
    }
  
}