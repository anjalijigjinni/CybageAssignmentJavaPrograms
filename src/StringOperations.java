
public class StringOperations {

	public static void main(String[] args) {

		String str = "aBCdefGHijKLmn";
		int len = str.length();
		System.out.println(len);
		String toUpperCase = str.toUpperCase();
		System.out.println(toUpperCase);
		String toLowerCase = str.toLowerCase();
		System.out.println(toLowerCase);

		String str1 = "abcd";
		String str2 = "efgh";
		String str3 = str1.concat(str2);
		System.out.println(str3);

		
		String trimming = "  helloooooo  ";
		System.out.println(trimming.trim());
	}

}
