package com.impl;

import com.entity.Message;
import com.repo.MessageRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Component
public class MessageRepoImpl implements MessageRepository {

    public MessageRepoImpl() {
    }

    public MessageRepoImpl(List<Message> messages) {
        this.messages = messages;
    }

    List<Message> messages = new ArrayList<Message>();

    public void addMessage(){
        messages.add(new Message("first", new Date(), 10.1, 20.2));
        messages.add(new Message("second", new Date(), 11.1, 21.2));
        messages.add(new Message("third", new Date(), 12.1, 22.2));

    }

    @Override
    public List<Message> listOfMessages(long max, int count) {
        this.addMessage();

        List<Message> recent = new ArrayList<Message>();
        int i = 0;
        for(Message message: messages){
            if (message.getId()<max){
                recent.add(message);
            }
            if (i==count) break;
            i++;
        }
        return recent;
    }

    @Override
    public Message findOne(long id) {
        this.addMessage();
        Message message = null;

        for (Message message1: messages){
            if (message1.getId()==id){
                message = message1;
            }else message = new Message("no messages found", new Date(), 0.0, 0.0);
        }
        return message;
    }
}
