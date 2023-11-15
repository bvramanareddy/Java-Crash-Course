import java.util.HashMap;
import java.util.Map;

public class Eghasheg {
    
    public static void main(String[] args) {
        
 
    Map<String, Integer> students= new HashMap<>();
    students.put("Ramana", 100);
    students.put("Reddy", 39);
    students.put("Sanju", 56);
    students.put("Raj", 45);

    System.out.println(students.keySet());

    for(String keyString: students.keySet())
    System.out.println(keyString+ " : " + students.get(keyString));
    }

}
