package d;

public class House_Robber_ll {
	public int rob(int[] nums) {
        if(nums.length == 0){
            return 0;

        }
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2) {
            return Math.max(nums[0],nums[1]);
        }

        int [] dp = new int[nums.length-1];
        int [] dp2 = new int [nums.length-1];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for(int i =2; i<nums.length-1; i++){
            dp[i] = Math.max(dp[i-1], dp[i-2]+nums[i]);
        }

        dp2[0] = nums[1];
        // if(nums.length>3){
            dp2[1] = Math.max(nums[1],nums[2]);
            for(int i = 3; i<nums.length; i++){
             dp2[i-1] = Math.max(dp2[i-2], dp2[i-3]+nums[i]);
        // }
        }
        return Math.max(dp[nums.length-2], dp2[nums.length-2]);
    }
}
