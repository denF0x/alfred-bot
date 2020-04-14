import java.util.ArrayList;
import java.util.List;

public class Answers {

    private static List<String> morningAnswers = new ArrayList<>();
    private static List<String> eveningAnswers = new ArrayList<>();

    Answers(){
        morningAnswers.add("А кто это у нас тут проснулься? Ты проснулься!");
        morningAnswers.add("Очередное карантинное утро. Не правда ли замечательно?");
        morningAnswers.add("Мороз и солнце.\n День чудесный.\n Еще не сдохли мы?\n Прелестно");
        morningAnswers.add("");
        morningAnswers.add("");
        morningAnswers.add("");
        morningAnswers.add("");
        morningAnswers.add("");
        morningAnswers.add("");
        morningAnswers.add("");

        eveningAnswers.add("");
        eveningAnswers.add("");
        eveningAnswers.add("");
        eveningAnswers.add("");
        eveningAnswers.add("");
        eveningAnswers.add("");
        eveningAnswers.add("");
        eveningAnswers.add("");
        eveningAnswers.add("");
        eveningAnswers.add("");
        eveningAnswers.add("");
    }

    public static String getMorningAnswer() {
        try {
            return morningAnswers.get(2);
            //return morningAnswers.get((int) (Math.random() * 10));
        } catch (Exception e) {
            return "Хуютро";
        }
    }

    public static String getEveningAnswer() {
        try {
            return eveningAnswers.get((int) (Math.random() * 10));
        } catch (Exception e) {
            return "Хуечер";
        }
    }
}
