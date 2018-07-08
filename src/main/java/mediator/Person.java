package mediator;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private ChatRoom room;
    private List<String> chatLog = new ArrayList<>();

    public Person(String name) {
        this.name = name;
    }

    public void recieve(String sender, String message){
        String s = sender + ": '" + message + "'";
        System.out.println("[" + name + "'s chat session] " + s);
        chatLog.add(s);
    }

    public void privateMessage(String destination, String message){
        room.message(name, destination, message);
    }

    public void say(String message){
        room.broadCast(name, message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ChatRoom getRoom() {
        return room;
    }

    public void setRoom(ChatRoom room) {
        this.room = room;
    }

    public List<String> getChatLog() {
        return chatLog;
    }

    public void setChatLog(List<String> chatLog) {
        this.chatLog = chatLog;
    }
}
