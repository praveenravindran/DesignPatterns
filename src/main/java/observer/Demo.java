package observer;

public class Demo implements Observer<Person> {

    public static void main(String[] args) {
        //1.Using Observer and Observable
        new Demo();

        //2. Using Event Class
        Student student = new Student();
        Event<PropertyChangedEventArgs>.Subscription subscription = student.propertyChanged.addHandler(x -> {
            System.out.println("Student's " + x.propertyName + " has changed to " + x.newValue);
        });
        for(int i = 20; i<25; i++){
            student.setAge(i);
        }
        subscription.close();
        student.setAge(30);
    }

    public Demo(){
        Person person = new Person();
        person.subscribe(this);
        for(int i = 20; i<25; i++){
            person.setAge(i);
        }
    }

    @Override
    public void handle(PropertyChangedEventArgs<Person> args) {
        System.out.println("Person's " + args.propertyName + " has changed to " + args.newValue);
    }
}
