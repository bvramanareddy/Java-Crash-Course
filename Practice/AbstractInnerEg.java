package Practice;
abstract class A{
    abstract void show();
    abstract void config();
}

public class AbstractInnerEg {
    public static void main(String[] args) {
        A obj=new A() {
            public void show()
            {
                System.out.println("in a New Show");
            }

                        void config() {
                            System.out.println("In new Config method");
            }

        };
        obj.show();
        obj.config();
    }
}
