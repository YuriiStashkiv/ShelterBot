package com.ldubgd.shelter.processor;

import com.ldubgd.shelter.handlers.CallbackQueryHandler;
import com.ldubgd.shelter.handlers.MessageHandler;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Message;

@Component
public class UpdateProcessor implements Processor {

    private final CallbackQueryHandler callbackQueryHandler;
    private final MessageHandler messageHandler;

    public UpdateProcessor(CallbackQueryHandler callbackQueryHandler, MessageHandler messageHandler) {
        this.callbackQueryHandler = callbackQueryHandler;
        this.messageHandler = messageHandler;
    }

    @Override
    public void executeMessage(Message message) {
        messageHandler.choose(message);
    }

    @Override
    public void executeCallbackQuery(CallbackQuery callbackQuery) {
        callbackQueryHandler.choose(callbackQuery);
    }
}
