package Practice;
public class ArrayEg {
    public static void main(String[] args) {
        
  
    int[] arr=new int[5];
    arr[0]=1;
    arr[1]=2;   
    arr[2]=3;
    arr[3]=4;
    arr[4]=5;
    System.out.println(arr.length);

    String[] names= {"Ramana",  "Reddy",  "Sanju"};
    int[] arr2=  {1,5,6};

//     for(int i=0; i<arr.length; i++)
//     {
//         System.out.println(arr[i]);
//     }

//     for(int i=0; i<names.length; i++)
//     {
//     System.out.println(names[i]);
// }
for(String n: names)
{
System.out.println(n);
}
for(int n: arr2)
{
    System.out.println(n);
}
}
}