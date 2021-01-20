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

    public boolean makes10(int a, int b) {
        if(a == 10 || b == 10 || a + b == 10){
            return true;
        }
        return false;
    }

    public boolean nearHundred(int n) {
        return ((Math.abs(100-n) <=10) || (Math.abs(200 - n) <= 10));
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        }
        else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }

    public String notString(String str){
        if (str.length() >= 3 && str.substring(0,3).equals("not")){
            return str;
        }
        return "not " + str;
    }

    public String missingChar(String str, int n) {
        String front = str.substring(0,n);
        String back = str.substring(n+1, str.length());
        return front + back;
    }

    public String frontBack(String str) {

        if(str.length() <= 1) return str;
        String mid = str.substring(1,str.length()-1);

        return str.charAt(str.length()-1) + mid + str.charAt(0);

    }





}
