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

    public String backAround(String str) {
        String last = str.substring(str.length()-1);
        return last + str + last;
    }

    public boolean or35(int n) {
        return n % 3 == 0 || n % 5 == 0;
    }

    public String front22(String str) {
        int take = 2;
        if (take > str.length()) {
            take = str.length();
        }

        String front = str.substring(0, take);
        return front + str + front;
    }


    public boolean startHi(String str) {
        if(str.length() < 2){
            return false;
        }

        String firstTwoElements = str.substring(0,2);
        if(firstTwoElements.equals("hi")){
            return true ;
        } else {
            return false;
        }
    }

    public boolean icyHot(int temp1, int temp2) {
        if(temp1 < 0 && temp2 > 100 || temp1 > 100 && temp2 < 0 ){
            return true;
        }
        return false;
    }

    public boolean in1020(int a, int b) {
        return ((a >= 10 && a <= 20) || (b >= 10 && b <=20));
    }

    public boolean hasTeen(int a, int b, int c) {
        if((a >= 13 && a <= 19) || (b >= 13 && b <= 19 ) || (c >= 13 && c <= 19)){
            return true;
        } else {
            return false;
        }
    }

    // above function refactored
    public boolean hasTeen2(int a, int b, int c) {
        return ((a >= 13 && a <= 19) || (b >= 13 && b <= 19 ) || (c >= 13 && c <= 19));
    }

    public boolean loneTeen(int a, int b) {
        if((a >= 13 && a <= 19) && (b >= 13 && b <= 19)){
            return false;
        } else if
        ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)){
            return true;
        }
        return false;
    }

    //above function  refactored
    public boolean loneTee2n(int a, int b) {
        // Store teen-ness in boolean local vars first. Boolean local
        // vars like this are a little rare, but here they work great.
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);

        return (aTeen && !bTeen) || (!aTeen && bTeen);
        // Translation: one or the other, but not both.
        // Alternately could use the Java xor operator, but it's obscure.
    }

    public String delDel(String str) {
        if(str.length() >= 4 && str.substring(1,4).equals("del")){
            return str.substring(0,1) + str.substring(4);
        }
        return str;
    }

    public boolean mixStart(String str) {
        if(str.length() >= 3 && str.substring(1,3).equals("ix")){
            return true;
        }
        return false;
    }


        // above code refactored
    public boolean mixStart2(String str) {
        return (str.length() >= 3 && str.substring(1,3).equals("ix"));
    }

    public String startOz(String str) {
        String result = "";

        if (str.length() >= 1 && str.charAt(0) == 'o') {
            result = result + str.charAt(0);
        }

        if (str.length() >= 2 && str.charAt(1) == 'z') {
            result = result + str.charAt(1);
        }

        return result;
    }

        public int intMax(int a, int b, int c) {
            int results = 0;
            if(a > b && a > c){
                results = a;
            }
            if(b > a && b > c){
                results = b;
            }
            if (c > a && c > b){
                results = c;
            }
            return results;
        }

    public int intMax2(int a, int b, int c) {
        int max;

        // First check between a and b
        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        // Now check between max and c
        if (c > max) {
            max = c;
        }

        return max;

        // Could use the built in Math.max(x, y) function which selects the larger
        // of two values.
    }

    public int close10(int a, int b) {
        int aDiff = Math.abs(a-10);
        int bDiff = Math.abs(b-10);

        if(aDiff > bDiff){
            return b;
        }
        if(bDiff > aDiff ){
            return a;
        }
        return 0;
    }











}
