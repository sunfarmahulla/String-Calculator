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
	public void twoNumbersCommaDelimeterReturnSum() {
		assertEquals(AddString.addString("1,2"),3);
	}
	public void twonumbersLinechnageDelimeterReturnsum() {
		assertEquals(AddString.addString("1\n2"),3);
	}
	public void addThreeNUmberWithDelimeterReturnSum() {
		assertEquals(AddString.addString("1\n2,3"),6);
	}
	
}
