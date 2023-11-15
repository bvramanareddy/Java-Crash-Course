package Practice;
class A
{
    public void show()
    {
System.out.println("In A show");
}
}

public class InnerEg {
    public static void main(String[] args) {
        A obj=new A()
        {
            public void show()
            {
            System.out.println("in New Implementation");
        }
        
    };
    obj.show();
    }
}

