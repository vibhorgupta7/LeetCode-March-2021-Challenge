class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount ==0)
            return 0;
        int dp[]=new int[amount+1];
        dp[0]=1;
        
        for(int i=0;i<coins.length;i++){
            for(int j=coins[i];j<dp.length;j++){
                
                if(j-coins[i]==0)
                    dp[j]=1;
                else{
                    if(dp[j-coins[i]] !=0){
                        int op1 = dp[j];
                        int op2 = dp[j-coins[i]] + 1;
                        if(op1!=0)
                        dp[j] = Math.min(op1,op2);
                        else
                            dp[j]=op2;
                    }
                }
            }
        }
        
        
        if(dp[dp.length-1] == 0)
            return -1;
        else
            return dp[dp.length-1];
    }
}