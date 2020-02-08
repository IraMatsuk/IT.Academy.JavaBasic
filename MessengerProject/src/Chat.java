import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;  

public class Chat {
    private final Set<User> users = new HashSet<>();
    private final List<Message> messages = new ArrayList<>();

    public Chat() {
    }

    public Chat(Set<User> users) { this.users.addAll(users);}

   // @Override
    public void addMessage(Message message) {
        this.messages.add(message);
    }

   // @Override
    public void addMessage(Message[] messages) {
        if (messages != null) {
            for (Message msg: messages) {
                this.addMessage(msg);
            }
        }
    }

    //@Override
    public void addMessage(List<Message> messages) {
        if(messages != null) {
            for (Message msg : messages) {
                this.addMessage(msg);
            }
        }
    }
}
