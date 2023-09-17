import LongestCommonPrefix.LongestCommonPrefixSolution;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;



import static org.junit.Assert.*;
public class AllTest {



    @Test
    @DisplayName("LongestCommonPrefix")
    public void LongestCommonPrefixTest() {
        assertEquals("d", LongestCommonPrefixSolution.longestCommonPrefix(new String[]{"an","d"}));
    }
}
