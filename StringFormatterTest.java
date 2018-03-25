import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class StringFormatterTest {

	@Test
	void test() {
		List<String> wordList1 = Arrays.asList("AP", "COMP", "SCI", "ROCKS");
		List<String> wordList2 = Arrays.asList("GREEN", "EGGS", "AND", "HAM");
		List<String> wordList3 = Arrays.asList("BEACH", "BALL");
		assertEquals(14, StringFormatter.totalLetters(wordList1));
		assertEquals(15, StringFormatter.totalLetters(wordList2));
		assertEquals(9, StringFormatter.totalLetters(wordList3));
		
//		assertEquals(2, StringFormatter.basicGapWidth(wordList1, 20));
//		assertEquals(1, StringFormatter.basicGapWidth(wordList2, 20));
//		assertEquals(11, StringFormatter.basicGapWidth(wordList3, 20));
		
		
	}

}
