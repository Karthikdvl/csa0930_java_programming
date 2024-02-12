public class ReverseAdd {
	long reverseDigits(long num)
	{
		long rev_num = 0;
		while (num > 0) {
			rev_num = rev_num * 10 + num % 10;
			num = num / 10;
		}
		return rev_num;
	}
	boolean isPalindrome(long num)
	{
		return (reverseDigits(num) == num);
	}
	void ReverseandAdd(long num)
	{
		long rev_num = 0;
		while (num <= 4294967295l) {
			rev_num = reverseDigits(num);
			num
				= num + rev_num;

			if (isPalindrome(num)) {
				System.out.println(num);
				break;
			}
			else if (num > 4294967295l) {
				System.out.println("No palindrome exist");
			}
		}
	}

	public static void main(String[] args)
	{
		ReverseAdd ob = new ReverseAdd();
		ob.ReverseandAdd(195l);
		ob.ReverseandAdd(265l);
	}
}
