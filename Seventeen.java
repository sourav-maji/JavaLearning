import java.util.HashMap;
import java.util.Map;

public class Seventeen {
    public static void main(String[] args) {
        Map <String, Integer> students = new HashMap<String, Integer>();
        students.put("Sourav" ,1);
        students.put("Subham" ,15);
        students.put("Satyam" ,5);

        System.out.println(students);
        System.out.println(students.get("Sourav"));

        // keys in Map are set i.e unique values

        System.out.println(students.keySet()); // this will return all the keys

        for(String name: students.keySet()){
            System.out.println( name + " : "+ students.get(name));
        }
    } 
}
