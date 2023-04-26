package week5.observer;

public interface Subject {

    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void postMeassage(String message);
}
