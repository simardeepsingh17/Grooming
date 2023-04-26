package week5.observer;

public class Subcriber1 implements Observer {

    @Override
    public void updateMessage(String message) {
        System.out.println(this.getClass() + " : " + message);
    }

}