package com.stackroute.pe5;

import java.util.*;
import java.util.Set;
import java.util.TreeSet;

public class SortedSet {
    public List methofForGettingSortedList(String[] strings) {
        if(strings==null)
            return null;

        List list = new ArrayList();//creating a new list
        for (String string : strings) {
            list.add(string);       //copying the list to string
        }
        TreeSet treeSet = new TreeSet(list); //copying list to tree set
        List list1=new ArrayList(treeSet);
        return list;
    }
}
