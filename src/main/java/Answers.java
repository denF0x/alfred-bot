import java.util.ArrayList;
import java.util.List;

public class Answers {

     private ArrayList <String> morningAnswers = new ArrayList<>();
     private List<String> eveningAnswers = new ArrayList<>();
     Answers() {
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

         eveningAnswers.add("Не засиживайся допозна, а то опять утро будет после полудня");
         eveningAnswers.add("Как классно, что завтра никуда не надо. По крайней мере, мне");
         eveningAnswers.add("Полночь приближается\nПолночь приближается\nПолночь приближается");
         eveningAnswers.add("Сладких снов! Но помни, что настоящее зло никогда не дремлет");
         eveningAnswers.add("Помни, что ни один порядочный человек не может уснуть, не почитав книжку перед сном");
         eveningAnswers.add("А может нафиг это «спать»? Время бинджвотчить сериалы!");
         eveningAnswers.add("Спокойной ночи! Пусть тебе присняться единорожки");
         eveningAnswers.add("Спи как маленький барсучок, которого обнимает одеялко");
         eveningAnswers.add("В любом месте засыпать веселее вместе!");
         eveningAnswers.add("Засыпай, и пусть твоя подушка будет мягкая как зефирка");
     }

    public String getMorningAnswer() {
        try {
            return morningAnswers.get((int) (Math.random() * 10));
        } catch (Exception e) {
            return "Хуютро";
        }
    }

    public String getEveningAnswer() {
        try {
            return eveningAnswers.get((int) (Math.random() * 10));
        } catch (Exception e) {
            return "Хуечер";
        }
    }

}
