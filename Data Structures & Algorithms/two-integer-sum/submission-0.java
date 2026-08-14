class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] outputIndex = new int[]{};

        if (nums == null || nums.length<2) {
            return outputIndex;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            int complement = target-nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return outputIndex;
    }
}
