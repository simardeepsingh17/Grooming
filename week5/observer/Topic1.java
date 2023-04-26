package week5.observer;

import java.util.ArrayList;
import java.util.List;

public class Topic1 implements Subject {

    List<Observer> observerList = new ArrayList<Observer>();

    @Override
    public void addObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void postMeassage(String message) {
        observerList.forEach(ob -> ob.updateMessage(message));
    }

}