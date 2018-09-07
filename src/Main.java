public class Main {
    public static void main(String[] args) {
        Func funcitons =  new Func();
        int[] numList = {-2,-1,0,1,2,3,4,5,6};

        //Run methods
        System.out.println("Sum of the list: " + funcitons.sumList(numList));
        System.out.println("Number of negative ints: " + funcitons.countNegativeInts(numList));
        System.out.println("Is pdlsdj: " + funcitons.isPalindrome("tagat"));
    }
}
