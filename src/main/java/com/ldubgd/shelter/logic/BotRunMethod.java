package com.ldubgd.shelter.logic;

import com.ldubgd.shelter.processor.Processor;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class BotRunMethod extends TelegramLongPollingBot {

    @Value("${telegram.bot.username}")
    private String username;
    @Value("${telegram.bot.token}")
    private String token;

    private Processor processor;

    @Override
    public void onUpdateReceived(Update update) {
        processor.processorUpdate(update);
    }

    @Override
    public String getBotUsername() {
        return username;
    }

    @Override
    public String getBotToken() {
        return token;
    }

    @Autowired
    public void setProcessor(Processor processor) {
        this.processor = processor;
    }
}
