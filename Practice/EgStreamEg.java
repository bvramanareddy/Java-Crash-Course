import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EgStreamEg {
    
    public static void main(String[] args) {
        
       List<Integer> numList=  Arrays.asList(4,5,12,23,33);
       
       Stream<Integer> result= numList.stream().filter(n -> n%2==0).sorted();
        System.out.println(result);
                        
    }
}
