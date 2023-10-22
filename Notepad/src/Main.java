import java.io.*;
import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("1 << Write");
        System.out.println("2 << Read");
        System.out.println("3 << Exit");

        int select = scan.nextInt();

        switch (select) { //Menu for Selecting the Action to Be Performed
            case 1 -> writeTxt();
            case 2 -> readTxt();
            case 3 -> System.exit(0);
            default -> System.out.println("Incorrect input!");
        }
    }

    public static void writeTxt() { //You can enter text, and it will be saved to a file named "Notepad.txt."
        System.out.println("Please enter the text: ");
        String txtLine = scan.next();

        try {
            FileWriter fWriter = new FileWriter("Notepad.txt");
            PrintWriter pWriter = new PrintWriter(fWriter);
            pWriter.print(txtLine);
            System.out.println("Text added!");
            readTxt();
            pWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readTxt() { //You can view the previously entered text from the "Notepad.txt" file.
        try {
            FileReader fReader = new FileReader("Notepad.txt");
            BufferedReader bufferedReader = new BufferedReader(fReader);
            String rRead = bufferedReader.readLine();
            System.out.println("Text contend: " + rRead);
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
