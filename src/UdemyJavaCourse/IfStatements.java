package UdemyJavaCourse;

public class IfStatements {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if(score == 5000){                                                  // --- In an if statement, the curly brackets and the code inside is known as a CODE BLOCK
            System.out.println("Your score is " + score + "!");             // --- Code block can acess variables created outside of the code block
        }                                                                   // --- You cannot, outside of the code block access variables created inside of the code block, it will be out of scope
    }
}
