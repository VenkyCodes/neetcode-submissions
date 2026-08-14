class Solution:
    def twoSum(self, nums, target):
        num_map = {}

        for i, num in enumerate(nums):
            idx = num_map.get(target - num)
            if idx is not None:
                return [idx, i]

            num_map[num] = i

        return []