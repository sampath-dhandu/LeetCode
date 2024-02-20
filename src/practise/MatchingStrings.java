/**
 * 
 */
package practise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author sampathdhand
 *
 */
public class MatchingStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strings = new ArrayList<String>();
		List<String> queries = new ArrayList<String>();
		strings.add("4");
		strings.add("aba");
		strings.add("baba");
		strings.add("aba");
		strings.add("xzxb");

		queries.add("3");
		queries.add("aba");
		queries.add("xzxb");
		queries.add("ab");

		answerQueries(strings, queries);

	}

	// public static List<Integer> matchingStrings(List<String> strings,
	// List<String> queries) {
	// Write your code here

//		Map<String, Integer> countMap = new HashMap<>();
//		for (String string : strings) {
//			if (strings.contains(string)) {
//				if (countMap.containsKey(string)) {
//					int count = (Integer) countMap.get(string);
//					countMap.put(string, count + 1);
//				} else {
//					countMap.put(string, 1);
//				}
//
//			}
//			System.out.println(countMap);
//
//		}
	// List<Integer> targetList = new ArrayList<>(countMap.values());

	// return targetList;
//		List<Integer> output = new ArrayList<Integer>();
//		for (String query : queries) {
//			int count = 0;
//			for (String string : strings) {
//				if (query.equals(string)) {
//					count++;
//				}
//			}
//			output.add(count);
//		}
//
//		return output;
	// }

	static int search(List<String> arr, String s) {
		int counter = 0;
		for (int j = 0; j < arr.size(); j++)

			/*
			 * checking if string given in query is present in the given string. If present,
			 * increase times
			 */
			if (s.equals(arr.get(j)))
				counter++;

		return counter;
	}

	static void answerQueries(List<String> arr, List<String> querries) {
		for (int i = 0; i < querries.size(); i++)
			System.out.print(search(arr, querries.get(i)) + " ");
	}

}
