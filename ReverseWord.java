import java.util.Scanner;
public class ReverseWord {
	
	static String reverseWord(String word)
	{
		int length = word.length();
		StringBuilder reversedWord
			= new StringBuilder(length);

		for (int i = length - 1; i >= 0; i--) {
			reversedWord.append(word.charAt(i));
		}

		return reversedWord.toString();
	}

	public static void main(String[] args)
	{	Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String originalWord = sc.nextLine();
		String reversed = reverseWord(originalWord);

		System.out.println("Original Word: "
						+ originalWord);
		System.out.println("Reversed Word: " + reversed);
	}
}
