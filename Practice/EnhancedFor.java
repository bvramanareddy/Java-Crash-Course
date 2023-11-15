package Practice;
class Student
{
   int rollno;
   String Name;
   int Marks; 
}
public class EnhancedFor {
    public static void main(String[] args) {
        
    Student s1=new Student();
    s1.rollno=12;
    s1.Name="Ramana";
    s1.Marks=99;

     Student s2=new Student();
    s2.rollno=32;
    s2.Name="Reddy";
    s2.Marks=90;

     Student s3=new Student();
    s3.rollno=23;
    s3.Name="Sanju";
    s3.Marks=87;

    Student studets[]= new Student[3];
        studets[0]=s1;
        studets[1]=s2;
        studets[2]=s3;

for(Student s: studets)
{
   System.out.println(s.Name + ":" + s.Marks);
}
           
    }
}
