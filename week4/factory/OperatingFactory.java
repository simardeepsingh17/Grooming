package week4.factory;

public class OperatingFactory {
    
    public Os getInstance(String str){
        
        if(str.equalsIgnoreCase("open")) return new Android();
        else if(str.equalsIgnoreCase("close")) return new Ios();
        else return new Windows();
    }
}
