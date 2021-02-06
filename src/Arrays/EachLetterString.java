package Arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class EachLetterString {

    public static Map<Character, Integer> countLetter(String str) {
        Map<Character, Integer> result = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (result.containsKey(ch)) {
                int count = result.get(ch); //1
                result.replace(ch, ++count);
            } else {
                result.put(ch, 1);
            }
        }
        return result;
    }
}
