public class CodingBat {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if(!weekday || vacation){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(sleepIn(false,false));
        System.out.println(sleepIn(true,false));
    }
}
