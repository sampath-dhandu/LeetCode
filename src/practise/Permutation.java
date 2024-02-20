package practise;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

    public static void main(String[] args) {


        System.out.println(permute(new int[]{1, 2, 3}));

    }

    public static List<List<Integer>> permute(int nums[]) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean freq[] = new boolean[nums.length];
        permuleImpl(nums, ds, ans, freq);
        return ans;
    }

    private static void permuleImpl(int[] nums, List<Integer> ds, List<List<Integer>> ans, boolean freq[]) {
        System.out.println(ds.size() + " : " + nums.length);
        if (ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!freq[i]) {
                freq[i] = true;
                ds.add(nums[i]);
                permuleImpl(nums, ds, ans, freq);
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }
    }


    private static List<List<Integer>> permute1(int nums[]) {
        List<List<Integer>> ans = new ArrayList<>();
        permuleImpl1(0, nums, ans);
        return ans;
    }


    private static void permuleImpl1(int index, int[] nums, List<List<Integer>> ans) {
        if (index == nums.length) {
            List<Integer> ds = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
        }
        for (int i = index; i < nums.length; i++) {
            swap(i, index, nums);
            permuleImpl1(index + 1, nums, ans);
            swap(i, index, nums);
        }
    }

    private static void swap(int i, int j, int nums[]) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
