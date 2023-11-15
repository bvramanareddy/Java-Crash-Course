package Practice;
enum Status
{
    Running, Failed, Pending, Completed;
}
public class AenumLoops {
 
    public static void main(String[] args) {
        Status s= Status.Completed;

        // Below is the If else method to use the ENUM constants
        // if (s==Status.Running) 
        //     System.out.println("Process is still Running");
        // else if (s==Status.Failed) 
        
        // System.out.println("Process is Failed");    
        
        // else if (s==Status.Pending) 
        
        // System.out.println("Process is in Pending state");    
        
        // else
        // System.out.println("Process Completed Successfully");
     
        //Below is the Switch case for ENUM usage
        switch (s) {
            case Running:
                System.out.println("Process is Runnig");
                break;
            case Pending:
            System.out.println("Pending Process");
            
            case Failed:
            System.out.println("Failed Process");
                break;
                default:
                System.out.println("Done");
                break;

        }
    }
}
