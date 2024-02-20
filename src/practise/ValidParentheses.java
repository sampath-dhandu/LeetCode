/**
 * 
 */
package practise;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author sampathdhand
 *
 */
public class ValidParentheses {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String str = "()";

		System.out.println(new ValidParentheses().validParentheses(str));
	}

	private boolean validParentheses(String str) {

		if (str == null || str.length() <= 0)
			return false;
		Map<Character, Character> parenthesesMapping = new HashMap<>();
		parenthesesMapping.put('(', ')');
		parenthesesMapping.put('{', '}');
		parenthesesMapping.put('[', ']');

		Stack<Character> parentheses = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (parenthesesMapping.containsKey(ch)) {
				parentheses.push(ch);
			} else {
				if (parentheses.isEmpty()) {
					return false;
				}
				char target = parentheses.pop();

				if (!parenthesesMapping.containsKey(target) || parenthesesMapping.get(target) != ch) {
					return false;
				}
			}
		}
		if (parentheses.size() >= 1)
			return false;
		return true;
	}
}
