import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {
    public static void main(String args[]) {
        int[] exampleIntArr = { 3, 5, 1, 2, 7, 9, 8, 13, 25, 32 };

        System.out.println(printSumReturnGreater(exampleIntArr, 10));

        ArrayList<String> exampleStringArr = new ArrayList<String>();
        exampleStringArr.add("Nancy");
        exampleStringArr.add("Jinichi");
        exampleStringArr.add("Fujibayashi");
        exampleStringArr.add("Momochi");
        exampleStringArr.add("Ishikawa");

        System.out.println(shuffelArrayString(exampleStringArr));

        alphabetFun();

        int[] tenRandList = tenRandomNums();

        for(int i=0; i<tenRandList.length;i++){
        System.out.println(tenRandList[i]);
        }

        randSortedMaxMin();

        randStringXCharsLong(5);
        nRandomStringsMCharsLong(10, 5);

    }

    // Create an array with the following values: 3,5,1,2,7,9,8,13,25,32.
    // Print the sum of all numbers in the array. Also have the function
    // return an array that only includes numbers that are greater than 10
    // (e.g. when you pass the array above, it should return an array with the
    // values of 13,25,32)

    public static ArrayList<Integer> printSumReturnGreater(int[] myArr, int y) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        int sum = 0;

        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] > y) {
                result.add(myArr[i]);
            }
            sum += myArr[i];
        }

        System.out.println(sum);

        return result;
    }

    // Create an array with the following values: Nancy, Jinichi, Fujibayashi,
    // Momochi, Ishikawa.
    // Shuffle the array and print the name of each person. Have the method also
    // return an array
    // with names that are longer than 5 characters.
    public static ArrayList<String> shuffelArrayString(ArrayList<String> arrStringList) {

        ArrayList<String> result = new ArrayList<String>();

        System.out.println("The Array list before the shuffel" + arrStringList);
        Collections.shuffle(arrStringList);
        System.out.println("The Array after the shuffel" + arrStringList);

        for (int i = 0; i < arrStringList.size(); i++) {
            if (arrStringList.get(i).length() > 5) {
                result.add(arrStringList.get(i));
            }
        }

        return result;

    }

    // Create an array that contains all 26 letters of the alphabet (this array must
    // have 26 values).
    // Shuffle the array and, after shuffling, display the last letter from the
    // array.
    // Have it also display the first letter of the array. If the first letter in
    // the array is a vowel, have it display a message.
    public static void alphabetFun() {

        // creating the array of the alphabet
        // the varibles start and end are stored as numbers that represent those
        // characters
        // therefor we can use a for loop to fill in the list with all the letters in
        // between
        char start = 'a', end = 'z';
        char[] alpha = new char[26];

        // in this for loop I need another varibale that will be for the index of the
        // char[]
        for (int i = start, ind = 0; i <= end; i++, ind++) {
            alpha[ind] = (char) i;
        }

        // this is now an array of characters from a-z
        System.out.println(alpha);

        // creating an ArrayList that can be shuffeled in the Collecitons class
        ArrayList<String> alphaArryList = new ArrayList<String>();

        for (int i = 0; i < alpha.length; i++) {
            alphaArryList.add(String.valueOf(alpha[i]));
        }

        System.out.println("Before the shuffel "+ alphaArryList);
        Collections.shuffle(alphaArryList);
        System.out.println("After the Shuffel "+ alphaArryList);

        System.out.println("The first letter of the newly shuffeled String alphbet thing is " + alphaArryList.get(0));
        System.out.println("The last letter of the newly shuffeled String alphbet thing is " + alphaArryList.get(alphaArryList.size()-1));

        // alphaArryList.get(0) is a String
        // .compareTo("someString") evaluates to an interger therefore we need to make
        // sure it is true by putting == 0
        if (alphaArryList.get(0).compareTo("a") == 0 || alphaArryList.get(0).compareTo("e") == 0
                || alphaArryList.get(0).compareTo("i") == 0 || alphaArryList.get(0).compareTo("o") == 0
                || alphaArryList.get(0).compareTo("u") == 0 || alphaArryList.get(0).compareTo("y") == 0) {
            System.out.println(
                    "The first letter of the newly shuffeled alphabet list is the vowel: " + alphaArryList.get(0));
        } else {
            System.out.println("The first letter of the newly shuffeled alphabet list is NOT a vowel");

        }
    }

    // Generate and return an array with 10 random numbers between 55-100
    public static int[] tenRandomNums() {
        int[] result = new int[10];
        Random r = new Random();

        for (int i = 0; i < result.length; i++) {
            result[i] = r.nextInt(45) + 55;
        }

        return result;
    }

    // Generate and return an array with 10 random numbers between 55-100 and
    // have it be sorted (showing the smallest number in the beginning).
    // Display all the numbers in the array. Next, display the minimum value
    // in the array as well as the maximum value.
    public static void randSortedMaxMin() {
        int[] intArr = tenRandomNums();
        // this code is irrevelent after the arrlist gets sorted
        // int myMax = intArr[0], myMin= myMax;

        // creating an ArraList of objects to be sorted in the Collections class
        ArrayList<Integer> intArrList = new ArrayList<Integer>();

        for (int i = 0; i < intArr.length; i++) {

            // this code is irrevelent after the arrayList is sorted
            // if(intArr[i]>myMax){
            // myMax = intArr[i];
            // }

            // if(intArr[i]<myMin){
            // myMin = intArr[i];
            // }

            intArrList.add((Integer) intArr[i]);
        }

        System.out.println("Before the sort" + intArrList);
        Collections.sort(intArrList);
        System.out.println("After the sort" + intArrList);

        System.out.println("Min will the the first of the list: " + intArrList.get(0));
        System.out.println("Max will at the end of the list: " + intArrList.get(intArrList.size() - 1));
    }

    // Create a random string that is 5 characters long.
    public static void randStringXCharsLong(int charLong) {
        String result = "";
        char start = 'a';
        int intStart = start;
        // int[] alph = new int[26];
        Random r = new Random();

        for (int i = 0; i < charLong; i++) {
            int rando = r.nextInt(26) + intStart;
            // System.out.println((char)rando);
            // System.out.println(String.valueOf((char)rando));
            // System.out.println("**adding to result below**");
            result += String.valueOf((char) rando);
        }

        System.out.println(result);
    }

    // Generate an array with 10 random strings that are each 5 characters long
    public static void nRandomStringsMCharsLong(int n, int m){
        for (int i = 0; i < n; i++){
            randStringXCharsLong(m);
        }
    }

}