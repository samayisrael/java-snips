import java.util.Scanner;

public class DecisionMaking {
    public static void main(String[] args) {

        int inputtedNum = 0;
        System.out.println("Pick a number between one and ten");

        Scanner scanner = new Scanner(System.in);
        inputtedNum = scanner.nextInt();

        if (inputtedNum < 5) {
            System.out.println("Enjoy the good luck a friend brings you");
        } else {
            System.out.println("Your show selection will make you happy today");
        }

    }
}
