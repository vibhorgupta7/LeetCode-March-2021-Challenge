class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        

        int MOD = 1_000_000_007;
        int n = arr.length;
        long[] dp = new long[n];
        Arrays.fill(dp, 1);
        Arrays.sort(arr);


        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < n; ++i)
            map.put(arr[i], i);
        
      
        for(int i=0;i<n;++i){
            
            for(int j=0;j<i;++j){
                
                int a=arr[j];   // 2
                int b=arr[i]/a; // 2
                
                if(b*a==arr[i]){
                    if(map.containsKey(b)){
                        dp[i] = (dp[i] + dp[j] * dp[map.get(b)]) % MOD;                            
                    }
                }
            }
        }
        
        long ans = 0;
        for(int i=0;i<dp.length;i++)
            ans+=dp[i];
        return (int) (ans % MOD);
        
    }
}