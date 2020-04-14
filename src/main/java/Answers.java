import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Answers {

     private static ArrayList <String> morningAnswers = new ArrayList<>();
     private static List<String> eveningAnswers = new ArrayList<>();


    public static String getMorningAnswer() {
        fillMorningList();
        try {
            return morningAnswers.get((int) (Math.random() * 10));
        } catch (Exception e) {
            return "Хуютро";
        }
    }

    public static String getEveningAnswer() {
        fillEveningList();
        try {
            return eveningAnswers.get((int) (Math.random() * 10));
        } catch (Exception e) {
            return "Хуечер";
        }
    }

    private static void fillMorningList() {
        morningAnswers.add("А кто это у нас тут проснулься? Ты проснулься!");
        morningAnswers.add("Очередное карантинное утро. Не правда ли замечательно?");
        morningAnswers.add("Мороз и солнце.\nДень чудесный.\nЕще не сдохли вы?\nПрелестно");
        morningAnswers.add("Утро должно начинаться со Стопгейма");
        morningAnswers.add("Самое время покормить кошку");
        morningAnswers.add("Ура! Новый день, пора листать все социальные сети до самого дна");
        morningAnswers.add("Погодка так и шепчет пойти сделать кофе");
        morningAnswers.add("Добро пожаловать в День Сурка!\nЭто лучший день. Потому что он единственный");
        morningAnswers.add("Хочу чтобы Солнышко улыбалось так же как и ты!");
        morningAnswers.add("С добрым утром! Желаю ярких эмоций");
    }
    private static void fillEveningList() {
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
}
