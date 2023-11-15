package Practice;
class Demo
{
    int age;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    String name;

}


public class ThisSuperEg {
    public static void main(String[] args) {
        Demo obj= new Demo();
        obj.age= 10;
        obj.name= "Reddy";
        obj.getAge();
        obj.getName();
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}
