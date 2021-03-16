class Solution {
    public int maxProfit(int[] arr, int fee) {
        
        int obp=arr[0]; // oldBuyProfit
        int osp=0;      // oldSellProfit
        
        for(int i=0;i<arr.length;i++){
            int nbp=0;  // newBuyProfit
            int nsp=0;  // newSellProfit
            
            if(arr[i]-osp<obp){
                nbp=arr[i]-osp;
            }else{
                nbp=obp;
            }
            
            if(arr[i]-obp-fee > osp){
                nsp=arr[i]-obp-fee;
            }else{
                nsp=osp;
            }
            
            obp=nbp;
            osp=nsp;
        }
        
        return osp;
    }
}