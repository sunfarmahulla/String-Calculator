import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

@Test
public class TestCalculator {
	
	public void emptyStringReturnZero() {
		AddString addstring = new AddString();
		assertEquals(AddString.addString(""),0);
	}
}
