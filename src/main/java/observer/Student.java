package observer;

public class Student {
    private int age;

    public Event<PropertyChangedEventArgs> propertyChanged = new Event<>();

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(this.age == age){
            return;
        }
        this.age = age;
        propertyChanged.fire(new PropertyChangedEventArgs(this, "age", age));
    }

}
