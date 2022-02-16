package Counter;

import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CharacterTextCounter count = new CharacterTextCounter();
        String line = scan.nextLine();
        while (!line.equalsIgnoreCase("stop")) {
            count.getRows();
            count.countCharacters(line);
            count.countNumberOfWords(line);
            line = scan.nextLine();
        }
        System.out.println("Characters counted: " + count.getCharacters());
        System.out.println("Rows counted: " + count.getRows());
        System.out.println("Words counted: " + count.getNumberOfWords());
    }
}
