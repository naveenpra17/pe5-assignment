import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import static org.junit.Assert.*;

public class ArrayElementUpdaterTest {
    private ArrayElementUpdater arrayElementUpdater;


    @Before
    public void setUp(){
        arrayElementUpdater=new ArrayElementUpdater();
    }

    @After
    public void tearDown(){
        arrayElementUpdater=null;
    }

    @Test//test case for updating list and clearing lit
    public void givenMethodWillCheckForUpdatedListWithGivenValues(){
        //input list for comparing with actual result
        List<String> list=new ArrayList<>();
        list.add("apple");
        list.add("mango");
        list.add("lemon");
        list.add("berry");
        //act
        String string=arrayElementUpdater.givenMethodWillUpdateTheList(list,"apple",
                "banana","lemon","cherry");

        //replaced actual string
        String actualString="[banana, mango, cherry, berry]";


        //assert
        assertEquals(actualString,string);
    }

    @Test//test method to check whether the input list is null or not
    public void givenMethodShouldCheckForNullList(){
        //null list
        List<String> list=new ArrayList<>();
        //act
        String result=arrayElementUpdater.givenMethodWillUpdateTheList(list,"apple",
                "banana","lemon","cherry");
        //assert
        assertEquals(result,"Empty String");
    }
}