import static org.junit.Assert.*;

import org.junit.Test;

public class WordProcessorTest {

	@Test
	public void testToString() {
		WordProcessor test = new WordProcessor("C:\\Users\\james\\git\\CSE274\\HW1-ArrayWordSampler\\textFiles");
		assertEquals((test.getFileAmt()), 3);
		System.out.println(test.toString());
	}

}
