
import java.util.*;

public class hackerrank {

//    In this challenge, you must read  integers from stdin and then print them to stdout. Each integer must be printed on a new line.
//    To make the problem a little easier, a portion of the code is provided for you in the editor below.
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
//    int a = scan.nextInt();
//    int b = scan.nextInt();
//    int c = scan.nextInt();
//    // Complete this line
//    // Complete this line
//
//    System.out.println(a);
//    System.out.println(b);
//    System.out.println(c);
//
//    System.out.println("===========================================");
//    int N = scan.nextInt();
//    scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//
//    boolean even = N % 2 == 0;
//    boolean odd = N % 2 != 0;
//
//    if(odd){
//        System.out.println("Weird");
//    }
//    if(even && (N >= 2 && N <= 5)){
//        System.out.println("Not Weird");
//    }
//    if(even && (N >= 6 && N <= 20)){
//        System.out.println("Weird");
//    }
//    else if(even && N > 20){
//        System.out.println("Not Weird");
//    }
//
//    System.out.println("===========================================");

//   At the end of each line of the provided input, there is an invisible "\n" which is called a newline character. This basically represents what happens when you press the "Enter" key when typing.
//
//1) The first scan.nextInt() grabs the first "int" from the input. It still leaves the "\n" on that line.
//
//2) The second scan.nextDouble() skips over that "\n" and grabs the first "double" it sees.
//
//3) Now is the tricky part. It turns out scan.nextLine() works differently than scan.nextInt() and scan.nextDouble() in that it doesn't skip over any "\n" newline characters. What it does is it reads and returns all characters until it reaches the "\n" (which it gets rid of), and stops. In the scenario above, since "\n" is the first thing we see, we get an empty String back on our 1st call to scan.nextLine().
//
//4) Our next call to scan.nextLine() will start on line 3 of input and grab the String we want.

//
//    int i = scan.nextInt();
//    double d = scan.nextDouble();
//
//    scan.nextLine();
//    String s = scan.nextLine();
//
//    System.out.println("String: " + s);
//    System.out.println("Double: " + d);
//    System.out.println("Int: " + i);


    // ("%-15s%03d%n", s1, x) % : used as a formatter. '-' : minus sign used for left indentation of the string. 15s : here 15 denotes the
    // string's minimum field width 15. '0' : pads the extra 0s in the integer. 3d : here 3 denotes integer's minimum field width 3. %n :
    // prints the new line.


    System.out.println("================================");
    for(int g=0;g<3;g++){
        String s1=scan.next();
        int x=scan.nextInt();
        //Complete this line
        System.out.printf("%-15s%03d%n", s1, x);
    }


    System.out.println("================================");



}

}
