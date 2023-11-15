package Practice;
enum Status
{
    LoginSuccessful, LoginFailure, LoginInterupted, ScenarioFailed;
}
public class Aenum {
    public static void main(String[] args) {
       
        Status[] ss= Status.values();
        for(Status s: ss)
        {
            System.out.println(s + " : " + s.ordinal());
        }
        
    }
}
