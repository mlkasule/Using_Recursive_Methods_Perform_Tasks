/**
 * A palindrome is a string that reads the same forwards or backwards; for
 * example dad, mom, deed (i.e., reversing a palindrome produces the same
 * string).
 * 
 * Write a recursive, boolean-valued method, isPalindrome that accepts a string
 * and returns whether the string is a palindrome.
 * 
 * A string, s, is a palindrome if:
 * 
 * s is the empty string or s consists of a single letter (which reads the same
 * back or forward), or the first and last characters of s are the same, and the
 * rest of the string (i.e., the second through next-to-last characters) form a
 * palindrome.
 * 
 * @author casul
 *
 */
public class PalindromeChecker {

	public static void main(String[] args) {

		String word = "mom"; // word to be checked

		boolean response = isPalindrome(word); // call method and check word

		System.out.println("Is " + word + " a palindrome? " + response);

	}

	/**
	 * check without loops
	 * 
	 * @param word
	 * @return
	 */
	public static boolean isPalindrome(String word) {

		int lastIndex = word.length() - 1;

		if (word.length() == 0 || word.length() == 1)
			return true;
		else if (word.charAt(0) == word.charAt(lastIndex))
			return isPalindrome(word.substring(1, lastIndex)); // recursive method until base
		else
			return false;
	}

}
