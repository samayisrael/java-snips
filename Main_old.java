import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int studentAge = 15;
        double studentGPA = 3.45;
        boolean hasPerfectAttendance = true;
        String studentFirstName = "Samay";
        String studentLastName = "Israel";
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);


        System.out.println(studentFirstName+" "+studentLastName+" has a GPA of "+studentGPA+". What would you like to change it to?");

        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();

        System.out.println(studentFirstName+" "+studentLastName+" now has a GPA of "+studentGPA);



    }
}
