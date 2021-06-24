import java.util.Scanner;

public class SongRepeat {
    public static void main(String[] args) {

        boolean isOnRepeat = true;

        Scanner input = new Scanner(System.in);


        while (isOnRepeat) {
            System.out.println("Playing Current Song");
            System.out.println("Would you like to take the song off repeat? If so answer yes");
            String userInput = input.next();

            if (userInput.equals("yes")){
                isOnRepeat = false;
            }

        }
        System.out.println("Playing Next Song");

    }
}
