package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MultipleOccurenceStringChecker {
    public Map<String,Boolean> thisMethodChecksForOccurenceOfStrings(String[] arr) {
        Map<String,Integer> map=new HashMap<>();
        if(arr.length==0)
            return null;
        for(String str:arr){    //iterating through the string array
            if(map.containsKey(str)){       //if map already contains the value then this condition will passes
                map.put(str,map.get(str)+1); //adding the string to the key part and incrementing the value part by 1

            }
            else    //if map doesnot contain key previsouly add the string to the key part and value as 1
            {
                map.put(str,1);
            }

        }
        Iterator<Map.Entry<String,Integer>> iterator=map.entrySet().iterator();// for iterating htrough the map
        Map<String,Boolean> map1=new HashMap<>(); //new map with boolean value
        while(iterator.hasNext()){

            Map.Entry<String,Integer> entry=iterator.next();// checking each entries of map
            if(entry.getValue()>=2){        //if value field is greater than or equal to 2 it enterrs if
                map1.put(entry.getKey(),true); //setting the value as true
            }
            else    //if value field is less than 2 add false to value field
                map1.put(entry.getKey(),false);
        }


        return map1;
    }
}
