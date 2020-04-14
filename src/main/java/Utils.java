import java.util.ArrayList;

public class Utils {
    public static String getRandomStringFromListSizeOfList(ArrayList<String> list){
        return list.get((int) (Math.random() * list.size()));
    }
}
