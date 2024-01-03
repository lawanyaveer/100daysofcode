import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int cnt = 1;
        int longest = 0;

        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int x = num;
                cnt = 1;
                while (set.contains(x + 1)) {
                    cnt++;
                    x = x + 1;
                }
            }
            longest = Math.max(longest, cnt);
        }

        return longest;
    }
}
