import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student
{
    int age;
    String name;
    
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
}


public class EgCompare {

        public static void main(String[] args) {

            Comparator<Student> com= new Comparator<Student>() {
                public int compare(Student i, Student j)
                {

             if(i.age>j.age)
            return 1;
            else
            return -1;
                }
            };  

            

        
        List<Student> studs=new ArrayList<>();
        studs.add(new Student(25,"Ramana"));
                studs.add(new Student(12,"Ramu"));
        studs.add(new Student(23,"Sanjeev"));
        studs.add(new Student(32,"Jay"));
        studs.add(new Student(52,"Advya"));
        System.out.println(studs);
           Collections.sort(studs, com);
        for(Student s: studs)
            System.out.println(s);
                
    }
}
