public class StringManipulatorTest{
    public static void main(String[] args){
        StringManipulator manipulatorObject = new StringManipulator();

        Character letter = 'o';
        Character letter2 = 'q';

        // testing out the trimAndConcatinate method in the StringManipulator class
        System.out.println(manipulatorObject.trimAndConcatinate("    Hellooo     ","        WORLDDD      ")); // prints "HelloooWORLDD"
        
        // testing out the getIndexOrNull method in the StringManipulator class
        System.out.println(manipulatorObject.getIndexOrNull("Coding",letter)); // prints 1
        System.out.println(manipulatorObject.getIndexOrNull("Hello World",letter)); // prints 4
        System.out.println(manipulatorObject.getIndexOrNull("Coding",letter2)); // prints null

        // testing out the getIndexOrNull with a substring
        System.out.println(manipulatorObject.getIndexOrNull("Coding","ing")); // prints 3
        System.out.println(manipulatorObject.getIndexOrNull("Coding","quail")); // prints null

        // testing out the concatSubstring function in the StringManipulator class
        System.out.println(manipulatorObject.concatSubstring("Coding Dojo", 2, 5, "YoMama")); // prints dinYoMama
    }
}