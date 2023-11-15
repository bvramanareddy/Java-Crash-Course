package Practice;
class A{
    static void show()
    {
        System.out.println("in A show");
    }
}
public class StaticEg {
    public static void main(String[] args) {
         
      A.show(); // when we declare methods as static we can access them without creating an object i.e with class name or Interface name.method
    }
}
