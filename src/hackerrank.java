
import java.util.*;

public class hackerrank {

//    In this challenge, you must read  integers from stdin and then print them to stdout. Each integer must be printed on a new line.
//    To make the problem a little easier, a portion of the code is provided for you in the editor below.
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    // Complete this line
    // Complete this line

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);

    System.out.println("===========================================");
    int N = scan.nextInt();
    scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    scan.close();

    boolean even = N % 2 == 0;
    boolean odd = N % 2 != 0;

    if(odd){
        System.out.println("Weird");
    }
    if(even && (N >= 2 && N <= 5)){
        System.out.println("Not Weird");
    }
    if(even && (N >= 6 && N <= 20)){
        System.out.println("Weird");
    }
    else if(even && N > 20){
        System.out.println("Not Weird");
    }

}

}
