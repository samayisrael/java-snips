import java.util.Scanner;

public class MultipleChoice {
    public static void main(String[] args) {

        String question = "What is the darkest color";
        String choiceOne = "white";
        String choiceTwo = "red";
        String choiceThree = "black";

        String correctAnswer = choiceThree;


        Scanner input = new Scanner(System.in);


        System.out.println(question);
        System.out.println("You can choose "+choiceOne+", "+choiceTwo+", or "+choiceThree);

        String userInput = input.next();

        if (correctAnswer.equals(userInput.toLowerCase())){
          System.out.println(correctAnswer+" is the correctAnswer. Congratulations!");
        } else {
          System.out.println("You are incorrect.  The correctAnswer is "+correctAnswer);
        }

    }
}
