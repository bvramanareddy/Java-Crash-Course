public class EgStringeg {
    
    public static void main(String[] args) {
        String name="Ramana Reddy boda";
        String name2="Sanjeev Reddy";
        String revString="";
        String reString2="";

        char ch;
        char ch2;

        for (int i=0; i<name.length(); i++) {
            ch =name.charAt(i);
            revString=ch+revString;
                        
        }
        System.out.println(revString);

    //     for(int i=name2.length()-1; i>0 ; i--)
    //     {
    //     reString2=reString2+ name2.charAt(i);

    //     }
    //    System.out.println(reString2);
    //    System.out.println(name.toLowerCase());
    //    System.out.println(name.toUpperCase());


    }
}
