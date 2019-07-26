package com.stackroute.pe5;

import java.util.Iterator;
import java.util.Map;

public class ValueShifter {
    public Map methodForShiftingValues(Map<String, String> map) {
        if(map.isEmpty())//checking for empty map
            return null;

        Iterator<Map.Entry<String,String>> iterator=map.entrySet().iterator();
        int count=0;
        String copy="";
        while (iterator.hasNext()) {

            Map.Entry<String, String> map1 = iterator.next();
            if (count %2== 0) { //copying the value of next map value to present map value
               copy = map1.getValue();
                map.put(map1.getKey()," ");
            }else
                map.put(map1.getKey(),map1.setValue(copy));
        }
        return map;
    }
}
