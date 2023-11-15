import java.lang.reflect.Array;

public class LargestArray {
    public static void main(String[] args) {
 
    
  int arr[]= {1099,34,65,3,999};
 
    int i=0;
    int max= arr[0];
    int small=arr[0];
    for( i=1;i<arr.length;i++)
            if (arr[i]> max) {
            max=arr[i];         
    }
        System.out.println("Largest Number is " + max);
    //for smallest
    
    for(i=1; i<arr.length; i++)
    if (arr[i]<small) {
        small=arr[i];
        
    }
    System.out.println("Smallest Number :" + small);
}
    }