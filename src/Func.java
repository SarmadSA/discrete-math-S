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
        //Search restriction from i to j.
        int i = 0, j = list.length - 1; //i is the lower limit in list, j is upper limit.
        while(i<j){
            int m = ((j+i)/2);
            if(list[m] < x){
                i = m + 1;
            } else{
                j = m;
            }
        }
        if(x==list[i]){
            foundAt = i;
        }
        return foundAt;
    }

    public int insertAt(int x, int[] list){
        int i = 0, j = list.length - 1;
        while(i<j){
            int m = ((j+i)/2);
            if(list[m] < x){
                i = m + 1;
            } else{
                j = m;
            }
        }
        return i;
    }
}
