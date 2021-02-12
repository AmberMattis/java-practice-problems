import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        System.out.println(fizzBuzz("fibb"));



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

    public boolean in3050(int a, int b) {
        if((a >= 30 && a <= 40) && (b >= 30 && b <= 40) ||
          (a >= 40 && a <= 50) && (b >= 40 && b <= 50) ){
            return true;
        }
        return false;
    }

    public int max1020(int a, int b) {
        int result = 0;
        if((a > b) && (a >= 10 && a <=20 )){
            result = a;
        }
        if((a < b) && (b < 10 || b > 20)){
            result = a;
        }

        if((b > a) && (b >= 10 && b <=20)){
            result = b;
        }
        if((b < a) && (a < 10 || a > 20)){
            result = b;
        }
        if((b < 10 || b > 20) && (a < 10 || a > 20)){
            result = 0;
        }
        return result;
    }


    //above code refactored
    public int max10202(int a, int b) {
        // First make it so the bigger value is in a
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        // Knowing a is bigger, just check a first
        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;
        return 0;
    }

    //practice
    public boolean stringE(String str) {
        int count = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'e') count++;
        }
        return (count>= 1 && count <=3);
    }

    public boolean lastDigit(int a, int b) {
        return (a % 10 == b % 10);
    }

    public String everyNth(String str, int n) {
        String result = "";
        for (int i = 0; i < str.length(); i = i + n){
            result = result + str.charAt(i);
        }
        return result;
    }

    public String stringTimes(String str, int n) {
        String result = "";
        for(int i = 0; i < n; i++){
            result += str;
        }
        return result;
    }

    public String stringTimes2(String str, int n) {
        String result = "";

        for (int i = 0; i < n; i++){
            result += str;
        }
        return result;
    }

    public String frontTimes(String str, int n) {
        int frontLen = 3;
        if(frontLen > str.length()){
            frontLen = str.length();
        }
        String front = str.substring(0, frontLen);

        String result = "";
        for(int i =0; i < n; i++){
            result += front;
        }
        return result;
    }

    int countXX(String str) {
        int count = 0;
        for(int i = 0; i < str.length()-1; i++){
            if(str.substring(i, i+2).equals("xx")){
                count++;
            }
        }
        return count;
    }

    boolean doubleX(String str) {
        int i = str.indexOf("x");
        if(i == -1){
            return false;  // checking if an x even exists in the string
        }
        //checking if the character at i+1 is also an x

        if(i+1 >= str.length()){ return false;} // checking if i + 1 is in bounds
        return str.substring(i+1, i+2).equals("x");

        // Another approach -- .startsWith() simplifies the logic
        // String x = str.substring(i);
        // return x.startsWith("xx");
    }

    //      corrent attempt
        public String stringBits(String str) {
            String result = "";
            // Note: the loop increments i by 2
            for (int i=0; i<str.length(); i+=2) {
                result = result + str.substring(i, i+1);
                // Alternately could use str.charAt(i)
            }
            return result;
        }
        //my attempt

    public String stringBits2(String str) {
        String result = "";
        for(int i = 0; i < str.length(); i++){
            if(str.length() < 3){
                result = str.substring(0,1);
            }else{
                result = str.substring(i,i+=2);
            }
        }
        return result;
    }

    public String stringSplosion(String str) {
        String result = "";
        //On each iteration we want to ass the substring of the chars 0,i
        //create a for loop to iterate over every characture in the string
        for(int i = 0; i < str.length(); i++){
            result = result + str.substring(0, i+1);
        }
        return result;
    }

    public int last2(String str) {
        // Screen out too-short string case.
        if (str.length() < 2) return 0;

        String end = str.substring(str.length()-2);
        // Note: substring() with 1 value goes through the end of the string
        int count = 0;

        // Check each substring length 2 starting at i
        for (int i=0; i<str.length()-2; i++) {
            String sub = str.substring(i, i+2);
            if (sub.equals(end)) {  // Use .equals() with strings
                count++;
            }
        }

        return count;
    }

    public List<Integer> doubling2(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        return nums;

        // OR the equivalent java streams solution:
        // return nums.stream()
        //  .map(n -> n * 2)
        //  .collect(Collectors.toList());
    }

    //Given a list of integers, return a list where each integer is multiplied by itself

    public List<Integer> square2(List<Integer> nums) {
        nums.replaceAll(n -> n * n);
        return nums;
    }

    // Given a list of strings, return a list where each string has "*" added at its end.
    public List<String> addStar(List<String> strings) {
        strings.replaceAll(n -> n + "*");
        return strings;
    }

    //Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.
    public List<String> copies3(List<String> strings) {
        strings.replaceAll(n -> n + n + n);
        return strings;
    }

    //Given a list of strings, return a list where each string has "y" added at its start and end.
    public List<String> moreY(List<String> strings) {
        strings.replaceAll(n -> "y" + n + "y");
        return strings;
    }

    //Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10
    public List<Integer> math1(List<Integer> nums) {
        nums.replaceAll(n -> (n + 1) * 10);
        return nums;
    }

    //Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %
    public List<Integer> rightDigit(List<Integer> nums) {
        nums.replaceAll(n -> n % 10);
        return nums;
    }

    //Given an array of ints, return the number of 9's in the a
    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 9) {
                count++;
            }
        }
        return count;
    }

   // Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.
   public boolean arrayFront9(int[] nums) {
       // First figure the end for the loop
       int end = nums.length;
       if (end > 4) end = 4;

       for (int i=0; i<end; i++) {
           if (nums[i] == 9) return true;
       }

       return false;
   }

   // Given a string if the string starts with f return fizz
   // If the string ends with b return buzz
   // If the string starts with f and ends with b return fizzbuzz
   // account for strings with neither f or b

    //1 create a method that takes in  string as a parameter
    //2 create a conditional that checks if the string starts with f ends with b  or both
    //3 sout either fizz , buzz, or fizzbuzz based on the parameters of the string




    public static String fizzBuzz(String input){
        String fizzbuzzResult = "";
        if(input.toLowerCase().startsWith("f") && input.toLowerCase().endsWith("b")){
            fizzbuzzResult = "fizzbuzz";
        }
        if(input.toLowerCase().startsWith("f") && !input.toLowerCase().endsWith("b")){
            fizzbuzzResult ="fizz";
        }
        if(!input.toLowerCase().startsWith("f") && input.toLowerCase().endsWith("b")){
            fizzbuzzResult = "buzz";
        } else if(!input.toLowerCase().startsWith("f") && !input.toLowerCase().endsWith("b")) {
            fizzbuzzResult = "No fizzbuzz here.";
        }
        return fizzbuzzResult;

    }



//    Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.
//
//
//    math1([1, 2, 3]) → [20, 30, 40]
//    math1([6, 8, 6, 8, 1]) → [70, 90, 70, 90, 20]
//    math1([10]) → [110]

    public List<Integer> math2(List<Integer> nums) {
        List<Integer> mathTwo = new ArrayList<>();

        for(int num : nums){
            num = (num + 1) * 10;
            mathTwo.add(num);
        }

        return mathTwo;

    }




   // Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)
    public List<Integer> rightDigitTwo(List<Integer> nums) {
        List<Integer> lastDigit = new ArrayList<>();

        for(int num : nums) {
            num = num % 10;
            lastDigit.add(num);
        }
        return lastDigit;

    }

    // Given a list of integers, return a list of the integers, omitting any that are less than 0.

        //my solution
        public List<Integer> noNeg(List<Integer> nums) {
            List<Integer> posNums = new ArrayList<>();

            for(int num : nums){
                if(num >= 0){
                    posNums.add(num);
                }
            }
            return posNums;
        }

        //refactored solution

    public List<Integer> noNeg2(List<Integer> nums) {
        nums.removeIf(n -> n < 0);
        return nums;

        // OR the equivalent stream solution
        // Note that the boolean logic is opposite
        // return nums.stream()
        //   .filter(n -> n >= 0)
        //   .collect(Collectors.toList());
    }




























}
