
public class AddString {
	private final static String delimeter = ",|\n";
	public static int addString(String string) {
		String[] num= string.split(delimeter);
		if(isEmpty(string)) {
			return 0;
		}
		if(string.length() ==1){
			return stringToInt(string);
		}
		else {
			return sum(num);
			//return Integer.parseInt(num[0])+Integer.parseInt(num[1]);
		}
		
		
	}
	private static int sum(String[] num) {
		return Integer.parseInt(num[0])+Integer.parseInt(num[1]);
	}
	
	private static boolean isEmpty(String string) {
		
		return string.isEmpty();
	}
	private static int stringToInt(String string)
	{
		return Integer.parseInt(string);
	}

	
	
}
