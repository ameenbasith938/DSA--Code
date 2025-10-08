class Solution {
    public int alternatingSum(int[] nums) {
        int sums=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i%2==0){
                sums+=nums[i];
            }
            else{
                sums-=nums[i];
                
                
            }

        }
        return sums;
        
    }
}