import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.bots.TelegramWebhookBot;
import org.telegram.telegrambots.meta.ApiContext;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class AlfredBot extends TelegramLongPollingBot {


    protected AlfredBot() {
        super();
    }
    public void onUpdateReceived(Update update) {

        // We check if the update has a message and the message has text
        if (update.hasMessage() && update.getMessage().hasText()) {
            // Set variables
            String message_text = update.getMessage().getText();
            long chat_id = update.getMessage().getChatId();
            System.out.println(chat_id + " " + message_text);
            SendMessage message = new SendMessage() // Create a message object object
                    .setChatId(chat_id)
                    .setText(message_text);
            try {
                execute(message); // Sending our message object to user
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

    public String getBotUsername() {
      return System.getenv("username");

    }


    public String getBotToken() {
        return System.getenv("token");
    }
}






//    public static boolean flag = false;
//
//    public void onUpdateReceived(Update update) {
//
//        if (update.hasMessage() && update.getMessage().hasText()) {
//            String user_first_name = update.getMessage().getChat().getFirstName();
//            String user_last_name = update.getMessage().getChat().getLastName();
//            String user_username = update.getMessage().getChat().getUserName();
//            long user_id = update.getMessage().getChat().getId();
//            String message_text = update.getMessage().getText();
//            long chat_id = update.getMessage().getChatId();
//            String answer = generateAnswer(message_text);
//
//            SendMessage message = new SendMessage()
//                    .setChatId(chat_id)
//                    .setText(answer);
//            System.out.println(message_text);
//            System.out.println((message_text.equals("стоп")));
//
//            System.out.println(flag);
//            if (flag) {
//                if (message_text.equals("стоп")) {
//                    flag = false;
//                } else {
//                    writeStory(message_text, user_first_name);
//                }
//            }
//            if (answer.equals("Расскажите ее, сэр. Но помедленнее, я записываю")) {
//                System.out.println("2");
//                flag = true;
//            }
//
//
//            log(user_first_name, user_last_name, Long.toString(user_id), message_text, answer);
//            try {
//
//                execute(message);
//            } catch (TelegramApiException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    private void writeStory(String message_text, String user_first_name) {
//    }
//
//
//    public String getBotUsername() {
//        return System.getenv("userName");
//    }
//
//    public String getBotToken() {
//        return System.getenv("token");
//    }
//
//    private String generateAnswer(String message_text) {
//
//        if (message_text.contains("Альфред")) {
//            if (message_text.equals("Альфред, у меня есть история")) {
//                System.out.println("1");
//                return "Расскажите ее, сэр. Но помедленнее, я записываю";
//
//            } else return "Да-да";
//        }
//        if (flag) {
//            if (message_text.equals("стоп")) {
//            return "Закончили";
//            }
//            return "Записал";
//        }
//        return "Вы не могли бы повторить, сэр?";
//    }
//
//    private void writeStory(String msg, String user_first_name) {
//        System.out.println("3");
//        try {
//            DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH");
//            String date = dateFormat.format(new Date());
//            boolean isFileExist = new File("C:\\Users\\DenysB\\Documents\\Alfred\\Запись Альфреда от " + date +  user_first_name + ".txt").exists();
//          /*  if (isFileExist == false) {
//                File file = new File("C:\\Users\\DenysB\\Documents\\Alfred\\Запись Альфреда от " + date + ".txt");
//
//                PrintWriter writer = new PrintWriter(file, "UTF-8");
//                writer.println(msg);
//                writer.close();
//            }*/
//            FileWriter writer = new FileWriter("C:\\Users\\DenysB\\Documents\\Alfred\\Запись Альфреда от " + date +  user_first_name + ".txt", true);
//            BufferedWriter bufferWriter = new BufferedWriter(writer);
//            bufferWriter.write(msg + System.lineSeparator());
//            bufferWriter.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
////        }
////    }
//
//
//
//    /*!(update.getMessage().equals("стоп"))*/
//
//    private void log(String first_name, String last_name, String user_id, String txt, String bot_answer) {
//        System.out.println("\n ---------------------------------");
//        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//        Date date = new Date();
//        System.out.println(dateFormat.format(date));
//        System.out.println("Message from " + first_name + " " + last_name + ". (id = " + user_id + ") \n Text - " + txt);
//        System.out.println("Bot answer: \n Text - " + bot_answer);
//    }
//}
