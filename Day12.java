class Solution {
    public boolean hasAllCodes(String s, int k) {
        int count=0,start=0;
        HashSet<String> set=new HashSet<>();
        
        for(int i=0;i<s.length();i++){
            count++;
            if(count==k){
                set.add(s.substring(start,start+k));
                start++;
                count--;
            }
        }
        
        return (set.size()==Math.pow(2,k));
        
    }
}

// NOTE: THIS IS SLIDING WINDOW CONCEPT

// public static helper(){
//     int count=0;
    
//     for(int i=0;i<s.length();i++){
//         count++;
//         if(count==k){
//             ** WRITE YOUR LOGIC **
            
//             count--;
//         }
//     }
// }