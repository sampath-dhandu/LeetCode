package practise;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 3, 5, 6 };
		System.out.println(new DuplicateCheck().containDuplicates(arr));
	}

	private boolean containDuplicates(int arr[]) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i]))
				return true;
			else
				map.put(arr[i], i);

		}

		return false;

	}
}
