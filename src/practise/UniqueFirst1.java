package practise;

import java.util.HashSet;
import java.util.PriorityQueue;

public class UniqueFirst1 {

	PriorityQueue<Integer> pqueue = null;;

	public UniqueFirst1(int nums[]) {
		HashSet<Integer> hashSet = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			hashSet.add(nums[i]);
		}
		pqueue = new PriorityQueue<>(hashSet);
	}

	public int showFirstUnique() {
		if (pqueue.isEmpty()) {
			return -1;
		}
		return pqueue.poll();

	}

	public void add(int number) {
		if (!pqueue.contains(number)) {
			pqueue.add(number);
		}
		System.out.println(pqueue);
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 1, 2, 4 };

		UniqueFirst1 first = new UniqueFirst1(arr);
		System.out.println(first.showFirstUnique());
		first.add(4);
		System.out.println(first.showFirstUnique());
		first.add(3);
		System.out.println(first.showFirstUnique());

	}

}
