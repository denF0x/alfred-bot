import org.apache.log4j.Logger;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AlfredBot extends TelegramLongPollingBot {


    public static boolean flag = false;

    public void onUpdateReceived(Update update) {

        if (update.hasMessage() && update.getMessage().hasText()) {
            String user_first_name = update.getMessage().getChat().getFirstName();
            String user_last_name = update.getMessage().getChat().getLastName();
            String user_username = update.getMessage().getChat().getUserName();
            long user_id = update.getMessage().getChat().getId();
            String message_text = update.getMessage().getText();
            long chat_id = update.getMessage().getChatId();
            String answer = message_text;

            SendMessage message = new SendMessage()
                    .setChatId(chat_id)
                    .setText(answer);


            log(user_first_name, user_last_name, Long.toString(user_id), message_text, answer);
            try {
                execute(message);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }



    private void log(String first_name, String last_name, String user_id, String txt, String bot_answer) {
        System.out.println("\n ---------------------------------");
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        System.out.println("Message from " + first_name + " " + last_name + ". (id = " + user_id + ") \n Text - " + txt);
        System.out.println("Bot answer: \n Text - " + bot_answer);
    }




    //    public void onUpdateReceived(Update update) {
//        String user_first_name = null;
//        if (update.hasMessage() && update.getMessage().hasText()) {
//            user_first_name = update.getMessage().getChat().getFirstName();
//        }
//            String message = update.getMessage().getText();
//            sendMsg(update.getMessage().getChatId().toString(), user_first_name, message);
//    }
//
//    public synchronized void sendMsg(String chatId, String name, String s) {
//        SendMessage sendMessage = new SendMessage();
//        sendMessage.enableMarkdown(true);
//        sendMessage.setChatId(chatId);
//        sendMessage.setText(name + ", это ты - " + s);
//        try{
//            execute(sendMessage);
//        } catch (TelegramApiException e) {
//            log.error("Exception: " + e.toString());
//        }
//    }
    public String getBotUsername() {
      return System.getenv("userName");

    }

    public String getBotToken() {
        return System.getenv("token");
    }
}