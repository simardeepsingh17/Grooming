package week5.observer;

public class ObserverMain {
    public static void main(String args[]) {
        Subject topic1 = new Topic1();
        Observer Subcriber1 = new Subcriber1();

        topic1.postMeassage("Welcome no one can see this");

        topic1.addObserver(Subcriber1);
        topic1.postMeassage("This is first message, only sub 1 can see");

    }
}
