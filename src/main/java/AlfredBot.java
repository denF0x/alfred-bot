import org.apache.log4j.Logger;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.PhotoSize;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class AlfredBot extends TelegramLongPollingBot {

    public void onUpdateReceived(Update update) {
        //for all for now
        if (update.hasMessage()) {
            String user_first_name = update.getMessage().getChat().getFirstName();
            String user_last_name = update.getMessage().getChat().getLastName();
            String user_username = update.getMessage().getChat().getUserName();
            long user_id = update.getMessage().getChat().getId();
            long chat_id = update.getMessage().getChatId();

            //if we got text
            if (update.getMessage().hasText()) {
                String answer = null;
                String message_text = update.getMessage().getText();
                if (message_text.equals("/start")) {
                    answer = "Well, hello there";
                } else if(message_text.equals("/pic")){
                    SendPhoto msg = new SendPhoto()
                                        .setPhoto("AgACAgIAAxkBAAIC1l6PQ0TJBKRQwisq9rmzaTEuoSdzAAKfrjEb_w54SA0k1NWNUOT5pKS6ki4AAwEAAwIAA3kAA16wAAIYBA")
                                        .setCaption("Photo");
                }

                //all texts
                else{
                answer = "Нет, " + user_first_name + " это ты - " + message_text;}
                sendMsg(answer, chat_id);
                log(user_first_name, user_last_name, Long.toString(user_id), message_text, answer);
            }


            //if we got photo
            //TODO: lesson 2
            else if (update.hasMessage() && update.getMessage().hasPhoto()) {
                List<PhotoSize> photos = update.getMessage().getPhoto();
                // Know file_id
                String f_id = photos.stream()
                        .sorted(Comparator.comparing(PhotoSize::getFileSize).reversed())
                        .findFirst()
                        .orElse(null).getFileId();
                // Know photo width
                int f_width = photos.stream()
                        .sorted(Comparator.comparing(PhotoSize::getFileSize).reversed())
                        .findFirst()
                        .orElse(null).getWidth();
                // Know photo height
                int f_height = photos.stream()
                        .sorted(Comparator.comparing(PhotoSize::getFileSize).reversed())
                        .findFirst()
                        .orElse(null).getHeight();

                String caption = "file_id: " + f_id + "\nwidth: " + Integer.toString(f_width) + "\nheight: " + Integer.toString(f_height);

                SendPhoto msg = new SendPhoto()
                        .setChatId(chat_id)
                        .setPhoto(f_id)
                        .setCaption(caption);

                try {
                    execute(msg);
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    private void sendMsg(String answer, long chat_id) {


        SendMessage message = new SendMessage()
                .setChatId(chat_id)
                .setText(answer);

        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
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


    public String getBotUsername() {
        return System.getenv("userName");

    }

    public String getBotToken() {
        return System.getenv("token");
    }
}