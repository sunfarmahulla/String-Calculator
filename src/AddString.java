
public class AddString {
	public static int addString(String string) {
		if(isEmpty(string)) {
			return 0;
		}
		return Integer.parseInt(string);
	}

	private static boolean isEmpty(String string) {
		
		return string.isEmpty();
	}

	
	
}
