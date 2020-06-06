
public class AddString {
	private final static String delimeter = ",|\n";
	public static int addString(String string) throws Exception {
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
	
	private static int sum(String[] num) throws Exception {
		int l=num.length;
		for(int i=0; i<l; i++) {
			if(Integer.parseInt(num[i])< 0) {
				throw new Exception("Negative string input");
			}
		}
		int add=0;
		for(int i=0; i<l; i++) {
			add+=Integer.parseInt(num[i]);
		}
		
		return add;
	}
	
	private static boolean isEmpty(String string) {
		
		return string.isEmpty();
	}
	private static int stringToInt(String string)
	{
		return Integer.parseInt(string);
	}

	
	
}
