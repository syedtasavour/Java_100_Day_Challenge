class CellPhone{
    
        
    
    void Calling(){
        System.out.println("Calling...");
    }
    void RinGing(){
        System.out.println("Ringing...");
    }
    void VibraTing(){
        System.out.println("Vibrating...");
    }void CallEnded(){
        System.out.println("CallEnded...");
    }
}


public class CellPhoneWithMethods {
    public static void main(String[] args) {
    CellPhone CallMethod = new CellPhone();
    CallMethod.Calling();
    CallMethod.RinGing();
    CallMethod.VibraTing();
    CallMethod.CallEnded();

} }
