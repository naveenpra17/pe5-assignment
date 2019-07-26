import java.util.*;

public class StringCounter {
    public Map<String, Integer> stringCounterMethod(String string) {
        if(string.isEmpty())//checking for empty string
            return null;
        String[] stringsArray = string.split("[^a-zA-Z0-9']+");//splitting the string into string array based on given conditons
        Map<String, Integer> map = new HashMap<>();
        for (String str : stringsArray) {
            if (map.containsKey(str)) {    //if map contains the key already
                map.put(str, map.get(str) + 1); //add the same key and increment value by 1
            } else {
                map.put(str, 1);//else add the key string and add value as 1
            }

        }
        return map;// return the final map
    }
}