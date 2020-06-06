
public class AddString {
	public static int addString(String string) {
		String[] num= string.split(",|\n");
		if(isEmpty(string)) {
			return 0;
		}
		if(string.length() ==1){
			return stringToInt(string);
		}
		else {
			return sum(num[0],num[1]);
			//return Integer.parseInt(num[0])+Integer.parseInt(num[1]);
		}
		
		
	}
	private static int sum(String num1, String num2) {
		return Integer.parseInt(num1)+Integer.parseInt(num2);
	}
	
	private static boolean isEmpty(String string) {
		
		return string.isEmpty();
	}
	private static int stringToInt(String string)
	{
		return Integer.parseInt(string);
	}

	
	
}
