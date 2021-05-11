public class Main {

	public static String reverse(String input){
		if (input == null || input.isEmpty()){
			return input;
		}
		return input.charAt(input.length() - 1) + reverse(input.substring(0, input.length() - 1));
	}

	public static Boolean isPalindromeString(String text){
		String reverse = reverse(text).toLowerCase();
		if(text.toLowerCase().equals(reverse)){
			return true;
		}
		return false;
	}
	
	
	public static void main(String args[]){
		System.out.println(isPalindromeString("anna"));
		System.out.println(isPalindromeString("Kayak"));
		System.out.println(isPalindromeString("Charles"));
		System.out.println(isPalindromeString("Chair"));
	}
}
