/**
 *
 */
package practise;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * @author sampathdhand
 *
 */
public class UniqueFirst {

    private Map<Integer, Boolean> map = null;
    private Queue<Integer> queue = null;

    private UniqueFirst(int[] nums) {
        map = new HashMap<Integer, Boolean>();
        queue = new LinkedList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], false);
            } else {
                map.put(nums[i], true);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (!map.get(nums[i])) {
                queue.add(nums[i]);
            }
        }
    }

    public int showFirstUnique() {
        if (queue.isEmpty())
            return -1;
        int current = queue.peek();
        while (map.get(current)) {
            queue.poll();
            if (queue.isEmpty())
                return -1;
            current = queue.peek();
        }
        //System.out.println(map);
        return current;
    }

    public void add(int value) {
        if (!map.containsKey(value)) {
            map.put(value, false);
            queue.add(value);
        } else {
            map.put(value, true);
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[] arr = {1, 2, 3, 1, 2, 4};

        UniqueFirst first = new UniqueFirst(arr);
        System.out.println(first.showFirstUnique());
        first.add(4);
        System.out.println(first.showFirstUnique());
        first.add(3);
        System.out.println(first.showFirstUnique());


    }

}
