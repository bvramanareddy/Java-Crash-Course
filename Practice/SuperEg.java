package Practice;
class A
{
public A()
{
    super();
    System.out.println("I am in Class A Constructor(Which is Super)");
}
public A(int n)
{
    super();
    System.out.println("I am in A class INT");
}
}
class B extends A
{
public B()
{
    super();
    System.out.println("I am in B Class Constructor");
}
public B(int n)
{
    super(n);
    System.out.println("In class B Class int");
}
}
public class SuperEg {
    public static void main(String[] args) {
        B bobj= new B(4);
        
    }
}
