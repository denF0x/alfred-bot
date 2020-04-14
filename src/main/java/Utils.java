import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Utils {
    public static String getRandomStringFromListSizeOfList(@NotNull ArrayList<String> list){
        return list.get((int) (Math.random() * list.size()));
    }
}
