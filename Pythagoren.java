public class Pythagoren {
    public double calculateHypotenuse(int legA, int legB) {
        
        int squSum = (legA *legA) + (legB *legB);
        double hyp = Math.sqrt(squSum);

        System.out.println("The hyp of a right triangle with the legs "+legA+" and "+legB+ " is "+hyp);

        return hyp;
    }
}