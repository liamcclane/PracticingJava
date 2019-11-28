import java.util.*;

public class ListExceptions {
    public static void main(String[] args) {

        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        try {
            for (int i = 0; i < myList.size(); i++) {
                System.out.println("The element we are looking at is : " + myList.get(i));
                Integer castVal = (Integer) myList.get(i);
                myList.set(i, castVal);
            }
        } catch (ClassCastException e) {
            System.out.println("can not chage element into interger use the length of the string");
        }
        System.out.println(myList);

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i).getClass());
        }
    }
}