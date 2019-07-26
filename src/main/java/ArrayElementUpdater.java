import javax.swing.text.html.HTMLDocument;
import java.util.List;
import java.util.ListIterator;

public class ArrayElementUpdater {

    public String givenMethodWillUpdateTheList(List list,String replaceWith1,
                                             String replaceBy1,String replaceWith2,String replaceBy2) {

        if (list.isEmpty())//checking for empty list
            return "Empty String";
        else {
            ListIterator<String> listIterator = list.listIterator();//to iterate through the list
            while (listIterator.hasNext()) { //checks for the next element in the list.if present this loop will run.
                String string = listIterator.next();
                if (string.equals(replaceWith1))//checking for old value in the list with new input value
                    listIterator.set(replaceBy1);//replacing new value
                if (string.equals(replaceWith2))//checking for old value in the list with new input value
                    listIterator.set(replaceBy2);//replacing new value
            }
            String result = list.toString();
            list.clear();   //emptying the list

            return result;
        }
    }
}
