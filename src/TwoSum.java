import java.util.HashMap;
import java.util.Map;

/**
 * Created by SUNNE on 1/3/2019.
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] ints = new Solution().twoSum(nums, target);
        int[] ints2 = new Solution_HashTable().twoSum(nums, target);
        System.out.println(ints);
    }

    static class Solution {
        int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
            return null;
        }
    }

    static class Solution_HashTable {
        int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                map.put(nums[i], i);
            }

            for (int i = 0; i < nums.length; i++) {
                int key = target - nums[i];
                if (map.containsKey(key) && map.get(key) != i) {
                    return new int[]{i, map.get(key)};
                }
            }
            return null;
        }
    }

    class Solution2 {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                map.put(nums[i], i);
            }

            for (int i = 0; i < nums.length; i++) {
                int key = target - nums[i];
                if (map.containsKey(key) && map.get(key) != i) {
                    return new int[]{i, map.get(key)};
                }
            }
            return null;
        }
    }
}
