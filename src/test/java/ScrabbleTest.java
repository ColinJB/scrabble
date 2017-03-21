import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleTest {

  @Test
  public void calculateScore_returnsScoreOfSingleLetter_1() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 1;
    assertEquals(expected, testScrabble.calculateScore("a"));
  }

  @Test
  public void calculateScore_returnScoreOfMultipleLetters_11() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 11;
    assertEquals(expected, testScrabble.calculateScore("fbdae"));
  }

}
