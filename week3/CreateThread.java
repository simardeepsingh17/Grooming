package week3;

public class CreateThread {
    public static void main(String[] args) {
        
        Thread t =new Thread("First thread");
        
        t.start();
        System.out.println(t.getName());
    }
}
