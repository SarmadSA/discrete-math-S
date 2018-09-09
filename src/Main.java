public class Main {
    public static void main(String[] args) {
        Func funcitons =  new Func();
        int[] numList = {-2,-1,0,1,2,3,4,4,5,7};
        int[] numList2 = {-2,-1,4,9,8,111,9,111,0,1,2,3,200,200,5,7};

        //Run methods
        System.out.println("Sum of the list: " + funcitons.sumList(numList));
        System.out.println("Number of negative ints: " + funcitons.countNegativeInts(numList));
        System.out.println("Is Palindrome: " + funcitons.isPalindrome("tagat"));
        System.out.println("Linearly found at: " + funcitons.linearSearch(2, numList));
        System.out.println("Binary found at: " + funcitons.binarySearch(2,numList));
        System.out.println("Insert x at: " + funcitons.insertAt(6,numList));
        System.out.println("First largest acc at: " + funcitons.findFirstLargestAccurence(numList2));
    }
}
