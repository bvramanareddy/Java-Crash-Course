import java.util.Arrays;
import java.util.List;

public class EgArrayList {
    
    public static void main(String[] args) {
        
        List<Integer> nums= Arrays.asList(4,5,6,7,8,9,10);
        int sum=0;
        for (Integer n : nums) {
            if(n%2==0)
            {
                n=n*2;
                sum=sum+n;
            }
            System.out.println(sum);
        }
        System.out.println(nums);
      //  System.out.println(sum);
    }
}
