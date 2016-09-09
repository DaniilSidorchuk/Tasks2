package task6.task1;

import static java.util.Collections.replaceAll;

/**
 * Created by Даня on 09.09.2016.
 */
public class Task6_1 {
    public static String change(String email) {
        String change = email;
       change = change.replace("@", "at");
       change = change.replace(".", "dot");

        return change;

    }
}
