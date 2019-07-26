package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class ValueShifterTest {
    private ValueShifter valueShifter;

    @Before//creating intance of valueshifter class
    public void setUp(){
        valueShifter=new ValueShifter();
    }
    @After
    public void tearDown(){
        valueShifter=null;
    }

    @Test//test method for checking if the shifting of value is working or not
    public void givenMethodWillCheckForValueShiftingOfValues(){
        //input map
        Map<String,String> map=new HashMap<>();
        map.put("val1","java");
        //act
        Map map1=valueShifter.methodForShiftingValues(map);
        //assert
        assertEquals(map1,map);
    }

    @Test
    public void givenMethodWillCheckForNullInputValue(){
        //null map
        Map<String,String> map=new HashMap<>();
        //act
        Map map1=valueShifter.methodForShiftingValues(map);


        //assert
        assertNull(map1);
    }
}