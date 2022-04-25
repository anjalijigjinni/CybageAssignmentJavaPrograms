
public class StringCountVowelsConsonants {

	public static void main(String[] args) {

		String str = "HelloWorld";
		str = str.toLowerCase();
		int vowelsCount = 0, consonantsCount = 0;
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				
				vowelsCount+=1;

			}
			else
			{
				consonantsCount+=1;
			}

		}
		
		System.out.println("Vowels count is  " +vowelsCount);
		System.out.println("Consonants count is  " +consonantsCount);

	}

}
