package com.repo;

import com.entity.Message;
import org.springframework.stereotype.Component;

import java.util.List;
//@Component
public interface MessageRepository {
    List<Message> listOfMessages (long max, int count);
    Message findOne (long id);
}
