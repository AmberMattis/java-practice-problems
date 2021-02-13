package UdemyJavaCourse;

public class Main {
    public static void main(String[] arg){
        BarkingDog barkingDog = new BarkingDog();

        barkingDog.shouldWakeUp(false,-1);
        System.out.println(barkingDog.shouldWakeUp(false,-1));

        System.out.println(barkingDog.shouldWakeUp(true,22));
        System.out.println(barkingDog.shouldWakeUp(false,23));
        System.out.println(barkingDog.shouldWakeUp(true,23));
        System.out.println(barkingDog.shouldWakeUp(true,7));



    }
}
