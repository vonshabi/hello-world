package Counter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CharacterTest {
    @Test
    public void TestStop() {
        //Arrange
        CharacterTextCounter count = new CharacterTextCounter();
        //Act
        CharacterTextCounter.containsStop("stop");
        boolean actual = CharacterTextCounter.containsStop("stop");
        //Assert
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    public void TestCountCharacters() {
        //Arrange
        CharacterTextCounter count = new CharacterTextCounter();
        //Act
        count.countCharacters("hej");
        int actual = count.getCharacters();
        //Assert
        int expected = 3;
        assertEquals(expected, actual);
    }
    @Test
    public void TestGetCharacters() {
        //Arrange
        CharacterTextCounter count = new CharacterTextCounter();
        //Act
        count.getCharacters();
        int actual = count.getCharacters();
        //Assert
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void TestCountNumberOfWords(){
        //Arrange
        CharacterTextCounter count = new CharacterTextCounter();
        //Act
        count.countNumberOfWords("Hej på dig");
        int actual = count.getNumberOfWords();
        //Assert
        int expected = 3;
        assertEquals(expected, actual);
    }
    @Test
    public void TestGetCountWords() {
        //Arrange
        CharacterTextCounter count = new CharacterTextCounter();
        //Act
        count.getNumberOfWords();
        int actual = count.getNumberOfWords();
        //Assert
        int expected = 0;
        assertEquals(expected, actual);
    }
    @Test
    public void TestGetRows() {
        //Arrange
        CharacterTextCounter count = new CharacterTextCounter();    //Act
        int actual = count.getRows();    //Assert
        int expected = 1;
        assertEquals(expected, actual);
    }


}
