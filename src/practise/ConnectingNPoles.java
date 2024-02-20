package practise;

import java.util.PriorityQueue;

public class ConnectingNPoles {

	public static void main(String arg[]) {

		int arr[]= {1,3,4,5};
		System.out.println(result(arr));
	}

	private static int result(int arr[]) {

		int res = 0;

		int n = arr.length;
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();

		for (int i = 0; i < n; i++) {
			priorityQueue.add(arr[i]);
		}

		while (priorityQueue.size() > 1) {

			int first = priorityQueue.poll();
			int second = priorityQueue.poll();
			
			res += first + second;
			priorityQueue.add(first + second);
			//System.out.println(res);
			//System.out.println(priorityQueue);
		}

		return res;
	}

}
