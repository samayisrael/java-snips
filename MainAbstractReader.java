import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        DigitsOnlyFileReader digitsOnly = new DigitsOnlyFileReader("message.txt");
        System.out.println(digitsOnly.readFile());
        System.out.println(digitsOnly.getPath());
    }
}
