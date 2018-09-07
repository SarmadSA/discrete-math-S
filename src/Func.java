public class Func {

    public int sumList(int[] list){
        int sum = 0;
        for(int num: list){
            sum += num;
        }
        return sum;
    }

    public int countNegativeInts(int[] list){
        int count = 0;
        for(int num: list){
            if(num < 0){
                count++;
            }
        }
        return count;
    }

    public boolean isPalindrome(String word){
        char[] charArray = word.toCharArray();
        boolean isPalindrome = true;
        for(int i = 0; i < (charArray.length/2); i++){
            if(charArray[i] != charArray[charArray.length - 1 - i]){
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
}
