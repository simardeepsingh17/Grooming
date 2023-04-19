package week4;

public class SingletonEnum {
    public static void main(String[] args) {
        
        Single obj1= Single.INSTANCE;
        System.out.println(obj1.hashCode());

        Single obj2= Single.INSTANCE;
        System.out.println(obj2.hashCode());
    }
}

enum Single{
    INSTANCE;

    int i;
    public void show(){
        System.out.println(i);
    }

}
