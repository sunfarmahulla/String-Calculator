import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class TestCalculator {
	
	private AddString addString;
	@BeforeTest
	public void init()
	{
		addString = new AddString();
	}
	
	public void emptyStringReturnZero() {
		assertEquals(AddString.addString(""),0);
	}
	public void singleValueReply() {
		assertEquals(AddString.addString("1"),1);
	}
	
	
}
