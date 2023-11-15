package Practice;

import java.util.ArrayList;
import java.util.Collection;

public class Demolist {
    
    public static void main(String[] args) {
        
   
    Collection<Integer> num= new ArrayList<Integer>();
    
        num.add(3);
        num.add(5);
        num.add(6);
        System.out.println(num.size());

        for(int n:num)

    {
        System.out.println(n);
     }

}
}
