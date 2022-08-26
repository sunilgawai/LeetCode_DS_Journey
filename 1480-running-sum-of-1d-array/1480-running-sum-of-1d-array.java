class Solution {
    public int[] runningSum(int[] nums) {
        int[] rSum = new int[nums.length];
        int sum = 0;
        if(nums.length != 0){
            for(int i = 0; i < nums.length; i++){
                sum += nums[i];
                rSum[i] = sum;
            }
        }
        return rSum;
    }
}