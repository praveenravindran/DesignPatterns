package mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {

    private List<Person> people = new ArrayList<>();

    public void join(Person person){
        person.setRoom(this);
        people.add(person);
        String joinMsg = person.getName() + " joins the chat";
        broadCast("room", joinMsg);
    }

    public void broadCast(String source, String message) {
        for (Person person : people)
            if (!person.getName().equals(source))
                person.recieve( source, message);
    }

    public void message(String source, String destination, String message) {
        people.stream()
                .filter(p ->p.getName().equals(destination))
                .findFirst()
                .ifPresent(person -> person.recieve(source, message));
    }
}
