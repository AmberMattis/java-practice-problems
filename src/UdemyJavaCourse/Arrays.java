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


    }



    //Write a method that return the sum of an array of integers
    public static int sum (int[] nums){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        return sum;
    }

}
