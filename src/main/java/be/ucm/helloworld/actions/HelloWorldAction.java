package be.ucm.helloworld.actions;

import be.ucm.helloworld.models.MessageStore;
import static com.opensymphony.xwork2.Action.SUCCESS;

public class HelloWorldAction {
    private MessageStore messageStore;
    private static int helloCount = 0;
    private String userName;

    public String execute() {
        messageStore = new MessageStore() ;
        if (userName != null) {
            messageStore.setMessage( messageStore.getMessage() + " " + userName);
        }

        helloCount++;
        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }

    public void setUsername(String userName) {
        this.userName = userName;
    }

    public void setMessageStore(MessageStore messageStore) {
        this.messageStore = messageStore;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getHelloCount() {
        return helloCount;
    }
}

