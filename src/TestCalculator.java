import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class TestCalculator {
	
	@BeforeTest
	public void init()
	{
		new AddString();
	}
	
	public void emptyStringReturnZero() throws Exception {
		assertEquals(AddString.addString(""),0);
	}
	public void singleValueReply() throws Exception {
		assertEquals(AddString.addString("1"),1);
	}
	public void twoNumbersCommaDelimeterReturnSum() throws Exception {
		assertEquals(AddString.addString("1,2"),3);
	}
	public void twonumbersLinechnageDelimeterReturnsum() throws Exception {
		assertEquals(AddString.addString("1\n2"),3);
	}
	public void addThreeNUmberWithDelimeterReturnSum() throws Exception {
		assertEquals(AddString.addString("1\n2,3"),6);
	}
	@Test(expectedExceptions=Exception.class)
	public void negativeException() throws Exception{
		AddString.addString("-1");
	}
	
}
