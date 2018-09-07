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

    public int linearSearch(int x, int[] list){
        int foundAt = -1;
        for(int i = 0; i < list.length; i++){
            if(list[i] == x){
                foundAt = i;
            }
        }
        return foundAt;
    }

    public int binarySearch(int x, int[] list){
        int foundAt = -1;
        int i = 0;
        int j = list.length;
        while(j != i){
            if(list[(j+i/2)-1] < x){
                i = j+i/2;
            } else{
                j = (j+i/2)-1;
            }
        }
        if(i==j){
            foundAt = i;
        }
        return foundAt;
    }
}
