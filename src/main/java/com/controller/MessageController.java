package com.controller;

import com.repo.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MessageController {

    private static final String MAX_LONG_AS_STRING = "9223372036854775807";

    //@Autowired field wiring not recommended

    private MessageRepository messageRepository;

    @Autowired
    public MessageController(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @RequestMapping(value = "/messages", method = RequestMethod.GET)
    public String messagesSimple (Model model){
        model.addAttribute("messageList", messageRepository.listOfMessages(Long.MAX_VALUE, 20));
        return "messages";
    }
    /*
    //using request parameters
    @RequestMapping (value = "/messages", method = RequestMethod.GET)
    public String messagesParam (@RequestParam(value = "max", defaultValue = MessageController.MAX_LONG_AS_STRING) long max,
                                 @RequestParam(value = "count", defaultValue = "20") int count, Model model){
        model.addAttribute("messageList", messageRepository.listOfMessages(max, count));
        return "messages";
    }

    //using Path parameters
    @RequestMapping (value = "/{messageId}", method = RequestMethod.GET)
    public String messagesPath (@RequestParam("messageId") long messageId, Model model){
        model.addAttribute(messageRepository.findOne(messageId));
        return "messages";
    }
    */



}
