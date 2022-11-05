import java.io.*;
import java.util.Formatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};


        try (FileWriter writer = new FileWriter("Alphabet.txt")) {
            FileReader reader = new FileReader("Alphabet.txt");
            Scanner sc = new Scanner(reader);
            Formatter formatter = new Formatter("Alphabet.txt");
            while (sc.hasNext()) {
                formatter.format("");
            }
            for (int i = 0; alphabet.length > i; i++) {
//                System.out.println(alphabet[i].toUpperCase());
                writer.write(alphabet[i].toUpperCase() + " " + alphabet[i] + '\n');
            }
            for (int i = 0; i < numbers.length; i++) {
//                System.out.println(numbers[i]);
                writer.write(numbers[i] + '\n');
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
//
        FileReader reader = new FileReader("Alphabet.txt");
        Scanner sc = new Scanner(reader);
//        Formatter formatter = new Formatter("Alphabet.txt");
//        StringBuilder builder = new StringBuilder();
        int count = 1;
        while (sc.hasNextLine()) {
            System.out.println(count + ": " + sc.nextLine());
            count++;
//            builder.append(sc.next()+'\n');
//            System.out.println(builder);
        }
    }
}