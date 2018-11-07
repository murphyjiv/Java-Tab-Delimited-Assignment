import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class StudentHashMap{
   private HashMap map;

//Constructor
   public StudentHashMap(){
      map = new HashMap();
   }

/*Adds student to the key's Arraylist of students, if an Arraylist
 does not exist it is created and then the student is added to the new Arraylist*/

   public void add(String key, Student value){
      if (map.containsKey(key)){
         List values = (List)map.get(key);
         values.add(value);
      }else{
         List values = new ArrayList();
         values.add(value);
         map.put(key, values);
      }
   }

//return the list of values associated with key
   public List getAllKeyValues(String key){
       return (List)map.get(key);
   }

//returns the unique keys of the Hashmap
   public List getKeys(){
       List <String> keys = new ArrayList<>(map.keySet());
       return keys;
   }

}
