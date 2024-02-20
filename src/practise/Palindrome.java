/**
 * 
 */
package practise;

/**
 * @author sampathdhand
 *
 */
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Palindrome plPalindrome = new Palindrome();
		System.out.println(plPalindrome.isPalindrome(121));
		
		long l = 3243433535444555567L;

	}

	private boolean isPalindrome(int number) {

		if (number < 0)
			return false;
		int y =0 ;
		int xx= number;
		
		while (xx>0) {
	        y = y*10 + xx%10;
	        xx/=10;
	        System.out.println(y);
	    }
	    return (y == number);
		
		
	}
}
