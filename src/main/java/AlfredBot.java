import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.PhotoSize;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class AlfredBot extends TelegramLongPollingBot {
    Answers answers = new Answers();

    public void onUpdateReceived(Update update) {
        //for all for now
        if (update.hasMessage()) {
            Message message = update.getMessage();
            if (message.hasText()) {
                handleTextMessage(message);

            }
            if (message.hasPhoto()) {
                handlePhotoMessage(message);
            }
        }
    }

    private void handleTextMessage(Message message) {
        String user_first_name = message.getChat().getFirstName();
        String user_last_name = message.getChat().getLastName();
        String user_username = message.getChat().getUserName();
        long user_id = message.getChat().getId();
        long chat_id = message.getChatId();

        //if we got text
        String answer = null;
        String messageText = message.getText();
        if (messageText.equals("/start")) {
            answer = "Well, hello there";
        }
        //for photo
        else if (messageText.equals("/pic")) {
            SendPhoto msg = new SendPhoto()
                    .setChatId(chat_id)
                    .setPhoto("AgACAgIAAxkBAAIC1l6PQ0TJBKRQwisq9rmzaTEuoSdzAAKfrjEb_w54SA0k1NWNUOT5pKS6ki4AAwEAAwIAA3kAA16wAAIYBA")
                    .setCaption("Photo");
            try {
                execute(msg);
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }


        else if(messageText.equals("Утро")) {
            answer = answers.getMorningAnswer();
        }
        else if(messageText.equals("Вечер")) {
            answer = answers.getEveningAnswer();
        }

        //all else texts
        else {
            answer = "Нет, " + user_first_name + " это ты - " + messageText;
        }


        sendMsg(answer, chat_id);
        log(message, answer);

    }


    private void handlePhotoMessage(Message message) {
        //if we got photo
        List<PhotoSize> photos = message.getPhoto();
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
                .setChatId(message.getChatId())
                .setPhoto(f_id)
                .setCaption(caption);
        log(message, "Photo");
        try {
            execute(msg);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

    }

    private void sendMsg(String answer, long chat_id) {
        ReplyKeyboardMarkup keyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> keyboard = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        row.add("Утро");
        row.add("Вечер");
        keyboard.add(row);
        keyboardMarkup.setResizeKeyboard(true);
        keyboardMarkup.setKeyboard(keyboard);

        SendMessage message = new SendMessage()
                .setChatId(chat_id)
                .setText(answer);
        message.setReplyMarkup(keyboardMarkup);
        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }


    private void log(Message message, String answer) {
        System.out.println("\n ---------------------------------");
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        System.out.println("Message from " + message.getChat().getFirstName() + " "
                + message.getChat().getLastName()
                + ". (id = " + message.getChat().getId()
                + ") \n Text - " + message.getText());
        System.out.println("Bot answer: \n Text - " + answer);
    }

    public String getBotUsername() {
        return System.getenv("userName");

    }

    public String getBotToken() {
        return System.getenv("token");
    }
}