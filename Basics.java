import java.util.*;

public class Basics{
    public static void main(String args[]){

        // print1to255();
        // print1to255Odd();
        // printRunningSum();
        
        int[] exampleArr= {2,-6,5,20,69};
        // printArray(exampleArr);
        // printArray(indexOfMax(exampleArr));
        // System.out.println(getAverage(exampleArr));

        System.out.println(getOddArry());
        System.out.println(greaterThanY(exampleArr, 5));
        System.out.println(squareValues(exampleArr));
        System.out.println(elemintateNegNums(exampleArr));
        
        for(int i = 0; i < 3; i++){
            System.out.println(myMaxMinAvg(exampleArr)[i]);
        }

        System.out.println(shiftingValues(exampleArr));

    }

    public static void print1to255(){
        
        for (int i=1; i<= 20; i++){
            System.out.println(i);  
        }
    }

    public static void print1to255Odd(){
        for (int i=1; i<=20; i+=2){
            System.out.println(i);
        }
    }

    public static void printRunningSum(){
        // initalizing a sum varible to output
        int sum = 0;

        for (int i =1; i<20; i++){
            sum += i;
            System.out.println("New Number is: " + i + " and the running sum: " + sum);
        }
    }

    public static void printArray(int[] myArr){
        String s = "{";
        for (int i=0; i<myArr.length;i++){
            s += myArr[i] + ",";
        }
        s += "}";
        System.out.println(s);
    }

    // this method finds the index of the maximum value of an array of intergers 
    // then returns that index and the value of the maximum vale in a new array
    public static int[] indexOfMax(int[] myArr){
        int myMaxIndex = 0, max = myArr[0];
        int[] ans = {myMaxIndex , max}; 

        for (int i=1; i < myArr.length;i++){
            if (myArr[i]>max){
                max = myArr[i];
                myMaxIndex = i;
            }
        }
        System.out.println("the max value of the array ");
        printArray(myArr);
        System.out.println(" is " + max + " at the " + myMaxIndex + " index of the array ");
        return ans;
    }

    public static double getAverage(int[] myArr){
        double avg;
        int sum = 0;

        for (int i = 0; i< myArr.length;i++){
            sum += myArr[i];
        }

        avg = sum/(myArr.length);
        return avg;
    }

    public static ArrayList<Object> getOddArry(){

        ArrayList<Object> list = new ArrayList<Object>();

        for (int i=1; i<=20 ; i+=2){
            list.add(i);
        }

        return list;
    }

    public static ArrayList<Object> greaterThanY(int[] myArr, int y ){
        
        ArrayList<Object> list = new ArrayList<Object>();

        for (int i = 0; i < myArr.length; i++){
            if (myArr[i] > y){
                list.add(myArr[i]);
            }
        }

        return list;
    }

    public static ArrayList<Object> squareValues(int[] myArr){
        ArrayList<Object> list = new ArrayList<Object>();

        for(int i = 0; i < myArr.length ; i++){
            list.add(myArr[i]*myArr[i]);
        }

        return list;
    }

    public static ArrayList<Object> elemintateNegNums(int[] myArr){
        ArrayList<Object> list = new ArrayList<Object>();

        for(int i = 0 ; i < myArr.length; i++){
            if (myArr[i]>=0){
                list.add(myArr[i]);
            }
        }

        return list;
    }

    public static double[] myMaxMinAvg(int[] myArr){
        int sum = myArr[0];
        // answer arr that is the {max, min, avg};
        double[] ans = {(double)sum, (double)sum, (double)sum};

        for (int i =0; i < myArr.length; i++){
            sum += myArr[i];
            
            if (ans[0]<myArr[i]){
                ans[0] = myArr[i];
            }
            
            if (ans[1]>myArr[i]){
                ans[1] = myArr[i];
            }
        }

        ans[2]  = sum/(myArr.length);
        return ans;
    }

    public static ArrayList<Object> shiftingValues(int[] myArr){
        
        ArrayList<Object> list = new ArrayList<Object>();

        for (int i = 1; i < myArr.length ; i++){
            list.add(myArr[i]);
        }
        list.add(0);

        return list;

    }


}