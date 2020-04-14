import java.util.ArrayList;
import java.util.List;

public class Answers {

    private static ArrayList <String> morningAnswers = new ArrayList<>();
    private static List<String> eveningAnswers = new ArrayList<>();

    Answers(){
        addToMorningList("А кто это у нас тут проснулься? Ты проснулься!");
        addToMorningList("Очередное карантинное утро. Не правда ли замечательно?");
        addToMorningList("Мороз и солнце.\\n День чудесный.\\n Еще не сдохли мы?\\n Прелестно");
        addToMorningList("");
        addToMorningList("");
        addToMorningList("");
        addToMorningList("");
        addToMorningList("");
        addToMorningList("");
        addToMorningList("");
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

    public void addToMorningList(String text){
        this.morningAnswers.add(text);
    };
}
