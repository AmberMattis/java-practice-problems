package UdemyJavaCourse;

public class BarkingDog {
//    We have a dog that likes to bark. We need to wake up if the dog is barking at night!
//    Write a method shouldWakeUp that has 2 parameters.
//
//    1st parameter should be of type boolean and be names barking, it should represent if our dog is barking
//    2nd parameter represents the hour of the day and is of the type int with the name hourOfDay and has a valid range 0-23
//    We need to wake up if the dog is barking before 8 or after 22 hours so in that case return true.
//    in all other cases return false.

    public boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(hourOfDay < 0 || hourOfDay > 23){
            return false;
        } else if(barking && (hourOfDay < 8 || hourOfDay > 22)){
            return true;
        } else {
            return false;
        }
    }




}
