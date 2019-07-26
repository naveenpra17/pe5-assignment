package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortedSetTest {

    private SortedSet sortedSet;
    @Before
    public void setUp(){
        sortedSet=new SortedSet();
    }

    @After
    public void tearUp(){
        sortedSet=null;

    }

    @Test//test method for checking sorted set
    public void givenMethodwillCheckForTheSortedSetInterface(){

        String[] strings={"Harry", "Olive", "Alice", "Bluto", "Eugene"};

        List list=sortedSet.methofForGettingSortedList(strings);

        List list1=new ArrayList();
        list1.add("Alice");
        list1.add("Bluto");
        list1.add("Eugene");
        list1.add("Harry");
        list1.add("Olive");



        //assert
        assertEquals(list,list1);

    }

    @Test
    public void givenMethodWillCheckForNullStringInput(){
        String[] strings={};
        //act
        List list=sortedSet.methofForGettingSortedList(strings);

        //assert
        assertNull(list);
    }



}