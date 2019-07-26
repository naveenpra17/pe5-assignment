package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MultipleOccurenceStringCheckerTest {
    private MultipleOccurenceStringChecker multipleOccurenceStringChecker;

    @Before//creating instance of MultipleOccurenceStringCheckerTest class
    public void setUp(){
        multipleOccurenceStringChecker=new MultipleOccurenceStringChecker();
    }
    @After
    public void tearDown(){
        multipleOccurenceStringChecker=null;
    }
    @Test//testing method to check for multipleoccurences of a string
    public void givenMethodShouldCheckForMultipleOccurencesOfValue(){

        String arr[] = {"a","b","c","d","a","c","c"};

        Map actualstring=multipleOccurenceStringChecker.thisMethodChecksForOccurenceOfStrings(arr);
        Map<String,Boolean> map=new HashMap<>();
        map.put("a",true);
        map.put("b",false);
        map.put("c",true);
        map.put("d",false);
        //asssert
        assertEquals(actualstring,map);
    }

    @Test// test case for null conditions
    public void givenMethodWillCheckForInputStringNullCondition(){
        String[] arr={}; //empty array
        //act
        Map actualstring=multipleOccurenceStringChecker.thisMethodChecksForOccurenceOfStrings(arr);


        //assert
        assertNull(actualstring); // checking whther the returned map value is null or not
    }
}

