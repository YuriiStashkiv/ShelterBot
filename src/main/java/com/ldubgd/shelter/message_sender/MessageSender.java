package com.ldubgd.shelter.message_sender;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;

public interface MessageSender {

    void sendMessage(SendMessage sendMessage);

    void sendEditMessage(EditMessageText editMessageText);
}
