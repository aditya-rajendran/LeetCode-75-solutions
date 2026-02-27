class Solution {
//not an ideal solution but it is guaranteed that there will be a majority element in the array
//Must be a better solution than this, but this is the one I came up with in a short time.

    public int majorityElement(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int x = 0; x < n; x++) {
                if (nums[x] == nums[i]) {
                    count++;
                }
            }

            if (count > n / 2) {
                return nums[i];
            }
        }

        return 404; //Only for the sake of having a return statement, this will never be reached as per the problem statement.
    }
}