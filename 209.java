class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0; 
        int len=0;
        int minlen=Integer.MAX_VALUE;
        int ws=0;
        int we=0;
        while(we<nums.length){
            sum+=nums[we];
            if(sum>=target){
                len=we-ws+1;
                minlen=Math.min(minlen,len);

            }
            while(sum>=target){
                sum-=nums[ws];
                ws++;
                if(sum>=target){
                len=we-ws+1;
                minlen=Math.min(minlen,len);

            }
           


            }
             we++;
        }
        if(minlen==Integer.MAX_VALUE){
            return 0;
        }
        return minlen;
        
    }
}