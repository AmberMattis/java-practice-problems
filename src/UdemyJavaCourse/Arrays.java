package UdemyJavaCourse;


public class Arrays {
    public static void main(String[]args){
        int[] numList = new int[5];
        numList[1] = 1;
        numList[2] = 2;
        numList[3] = 3;
        numList[4] = 4;

        System.out.println(sum(numList));

        int[] numSixList = new int[6];

        numSixList[0] = 1;
        numSixList[1] = 4;
        numSixList[2] = 3;
        numSixList[3] = 7;
        numSixList[4] = 7;
        numSixList[5] = 20;


        System.out.println(sum(numSixList));


        int[] numAverage =  new int[5];

        numAverage[0] = 2;
        numAverage[1] = 3;
        numAverage[2] = 6;
        numAverage[3] = 5;
        numAverage[4] = 4;


        System.out.println(average(numAverage));


    }



    //Write a method that return the sum of an array of integers
    public static int sum (int[] nums){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        return sum;
    }

    //Write a method that return the average of an array of integers
    public static double average (int[] nums){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }

        return sum / nums.length;
    }

}
