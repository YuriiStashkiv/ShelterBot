package com.ldubgd.shelter.message_sender;

import com.ldubgd.shelter.logic.BotRunMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Service
public class MessageSenderImpl implements MessageSender{
    private BotRunMethod botRunMethod;

    @Override
    public void sendMessage(SendMessage sendMessage) {
        try {
            botRunMethod.execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void sendEditMessage(EditMessageText editMessageText) {
        try {
            botRunMethod.execute(editMessageText);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    @Autowired
    public void setBotRunMethod(BotRunMethod botRunMethod){
        this.botRunMethod = botRunMethod;
    }
}
