package observer;

import java.util.ArrayList;
import java.util.List;

class Observable<T> {

    private List<Observer<T>> observers = new ArrayList<>();

    public void subscribe(Observer<T> observer){
        observers.add(observer);
    }

    protected void notifyPropertyChange(T source, String propertyName, Object newValue){
        for(Observer observer : observers){
            observer.handle(new PropertyChangedEventArgs(source, propertyName, newValue));
        }
    }

}
