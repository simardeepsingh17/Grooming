package week4.factory;

public class FactoryMain {
    
    public static void main(String[] args) {
        OperatingFactory obj1= new OperatingFactory();
        Os obj2 = obj1.getInstance("close");
        obj2.spec();
    }
}
