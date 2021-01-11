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

    public static void main(String[] args) {
        System.out.println(sleepIn(false,false));
        System.out.println(sleepIn(true,false));
        System.out.println(monkeyTrouble(true,true));
        System.out.println(sumDouble(10,10));
        System.out.println(sumDouble(8,4));
    }
}
