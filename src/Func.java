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
        return  count;
    }


}
