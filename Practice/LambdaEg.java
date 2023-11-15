package Practice;
/**
 * InnerLambdaEg
 */
@FunctionalInterface
 interface InnerLambdaEg {
void show();

    
}
public class LambdaEg {
    public static void main(String[] args) {
     InnerLambdaEg objEg= () -> System.out.println("Im in show but using Functioanl Interface and Lambda"); 
        objEg.show();
    }
}
