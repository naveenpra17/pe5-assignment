import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class StringCounterTest {

    private StringCounter stringCounter;

    @Before//object creation for Stringcounter class
    public void setUp(){
        stringCounter=new StringCounter();
    }
    @After
    public void tearDown(){
        stringCounter=null;
    }

    @Test//test the number of counts of string from the input string is equal to expectedd value
    public  void givenMethodWillCheckForTheNumberOfCountsOfInputString(){


        String str[] ={"one one -one___two,,three,one @three*one?two"};
        String string="";
        for(String str1:str)//converting string array into string
            string    =string+str1;
        //act
       Map map=stringCounter.stringCounterMethod(string);

        Map<String,Integer> map1=new HashMap<>();//adding actual map
        map1.put("one",5);
        map1.put("two",2);
        map1.put("three",2);

        //assert
       assertEquals(map,map1);

    }
    @Test//test case for empty string
    public void givenMethodShouldCheckForEmptyString(){

        String string="";
        //act
        Map map=stringCounter.stringCounterMethod(string);
        //assert
        assertNull(map);
    }

}