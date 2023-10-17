package com.ldubgd.shelter.handlers;

import com.ldubgd.shelter.message_sender.MessageSender;
import org.telegram.telegrambots.meta.api.objects.Message;

public class MessageHandler implements Handler<Message>{

    private final MessageSender messageSender;

    public MessageHandler(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    @Override
    public void choose(Message message) {

    }
}
