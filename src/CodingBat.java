import java.util.List;
public class CodingBat {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if(!weekday || vacation){
            return true;
        }
        return false;
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if(aSmile && bSmile || !aSmile && !bSmile){
            return true;
        }
        return false;
    }

    public static int sumDouble(int a, int b) {
        if(a == b){
            return (a + b) * 2;
        }
        return a + b;
    }

    public static int diff21(int n) {
        int diff = 21-n;
        if(n > 21){
            return diff * -2;
        }
        return diff;
    }
    public static List<Integer> doubling(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        return nums;
    }

    //Given a list of integers, return a list where each integer is multiplied with itself.
    public List<Integer> square(List<Integer> nums) {
        nums.replaceAll(n->n*n);
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(diff21(14));
        System.out.println(diff21(25));
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        if((hour > 20 || hour < 7) && (talking == true)){
            return true;
        }else {
            return false;
        }
    }



}
