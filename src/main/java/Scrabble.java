import java.util.List;
import java.util.ArrayList;

public class Scrabble {
  public Integer calculateScore(String input) {
    Integer result = 0;
    String[] letters = {"aeioulnrst", "dg", "bcmp", "fhvwy", "k", "jx", "qz"};
    String[] inputChars = input.toLowerCase().split("");
    for (String eachChar : inputChars) {
      if (letters[0].contains(eachChar)) {
        result += 1;
      } else if (letters[1].contains(eachChar)) {
        result += 2;
      } else if (letters[2].contains(eachChar)) {
        result += 3;
      } else if (letters[3].contains(eachChar)) {
        result += 4;
      } else if (letters[4].contains(eachChar)) {
        result += 5;
      } else if (letters[5].contains(eachChar)) {
        result += 8;
      } else if (letters[6].contains(eachChar)) {
        result += 10;
      }
    }
    return result;
  }
}
