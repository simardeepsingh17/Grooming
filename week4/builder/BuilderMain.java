package week4.builder;

public class BuilderMain {
    
    public static void main(String[] args) {
        
        Phone p = new BuilderPhone().setOs("android").setBattery(1000).getPhone();
        System.out.println(p);
    }
}
