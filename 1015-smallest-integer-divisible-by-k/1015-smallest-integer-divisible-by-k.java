class Solution {
    public int smallestRepunitDivByK(int k) {
     
        int rem = 1 % k;
        if(rem == 0) return 1;
        int ans = 1;
        for(int i = 0;i<=k;i++){
            rem = (rem*10 + 1) % k;
            ans++;
            if(rem == 0) return ans;
        }
        return -1;
    }
}
