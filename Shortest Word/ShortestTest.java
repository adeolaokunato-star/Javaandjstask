import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class ShortestTest {
    @Test
    public void SingleWordReturnsThatWord() {
        assertEquals("Java", Shortest.find("Java"));
    }
    @Test
    public void ManyWordsReturnsShortestWord() {
        assertEquals("is", Shortest.find("Java is noo dey fun"));
    }
    @Test
    public void ReturnsFirstWord(){
        assertEquals("is", Shortest.find("Yomi is the boy"));
    }
    @Test
    public void shouldReturnFirstWordWhenLengthsAreTied() {
        assertEquals("cat", Shortest.find("cat dog bird"));
    }
}


