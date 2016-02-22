import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class WCTest{
    @Test
    public void test_countCharacter_gets_total_number_of_characters_in_a_string(){
        String data = "This is a file to implement File system in JAVA\n";
        WC wc = new WC(data);
        int characterCount = wc.countCharacters();
        assertEquals(48,characterCount);
    }

    @Test
    public void test_countWords_gets_the_total_number_of_words(){
        String data = "This is a file to implement File system in JAVA\n";
        WC wc = new WC(data);
        int wordCount = wc.countWords();
        assertEquals(10,wordCount);
    }

    @Test
    public void test_countLines_gets_the_total_number_of_words_if_there_are_multiple_words(){
        String data = "lalala...\nMy Name is Khan and I am Not a Bollywood Actor.";
        WC wc = new WC(data);
        int wordCount = wc.countWords();
        assertEquals(11,wordCount);
    }

    @Test
    public void test_countLines_gets_the_total_number_of_lines(){
        String data = "This is a file to implement File system in JAVA\n";
        WC wc = new WC(data);
        int lineCount = wc.countLines();
        assertEquals(1,lineCount);
    }

    @Test
    public void test_countLines_gets_the_total_number_of_lines_if_there_are_multiple_lines(){
        String data = "This is a file to implement File system in JAVA.\nWC is a very good util to get no of Words\n";
        WC wc = new WC(data);
        int lineCount = wc.countLines();
        assertEquals(2,lineCount);
    }
}
