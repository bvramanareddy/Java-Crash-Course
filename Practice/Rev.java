import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Rev {
    public static void main(String[] args) {
        String nameString= "RamanaReddY";
        char ch;
        String revString="";

for(int i=0;i<nameString.length(); i++)
{
    ch= nameString.charAt(i);
    revString= ch+ revString;
}
System.out.println(revString);

        

    }
}
