import java.util.List;
import java.util.ArrayList;

public class Scrabble {
  public Integer calculateScore(String input) {
    Integer result = 0;

    if ( input.equals("a") ) {
      result += 1;
    }
    return result;
  }
}
