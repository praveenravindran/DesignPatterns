package observer;

interface Observer<T> {
    void handle(PropertyChangedEventArgs<T> args);
}
