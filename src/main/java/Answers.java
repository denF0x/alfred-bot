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
            return morningAnswers.get(2);
            //return morningAnswers.get((int) (Math.random() * 10));
        } catch (Exception e) {
            return "Хуютро";
        }
    }

    private static void fillMorningList() {


        addToMorningList("А кто это у нас тут проснулься? Ты проснулься!");
        addToMorningList("Очередное карантинное утро. Не правда ли замечательно?");
        addToMorningList("Мороз и солнце.\\n День чудесный.\\n Еще не сдохли мы?\\n Прелестно");

    }

    public static String getEveningAnswer() {
        try {
            return eveningAnswers.get((int) (Math.random() * 10));
        } catch (Exception e) {
            return "Хуечер";
        }
    }

    public static void addToMorningList(String text){
        morningAnswers.add(text);
    };
}
