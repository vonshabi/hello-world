package Counter;

public class CharacterTextCounter {
    private int letters = 0;
    private int rows = 0;
    private int word = 0;
    private String text = "";

    public static boolean containsStop(String text) {
        return true;
    }

    public void countCharacters(String myString) {
        letters = letters + myString.length();
    }

    public int getCharacters() {
        return letters;
    }

    public void countNumberOfWords(String myString) {
        String[] words = myString.split(" ");
        for (int i = 0; i < words.length; i++) {
            word++;
        }
    }

    public int getNumberOfWords() {
        return word;
    }

    public int getRows() {
        return rows = rows + 1;
    }
}
