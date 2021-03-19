class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        HashSet<Integer> visited = new HashSet<>();
        visited.add(0);
        
        Stack<Integer> stack = new Stack<>();
        stack.add(0);
        
        while(!stack.isEmpty()){
            List<Integer> keys= rooms.get(stack.pop());
            for( int ke: keys){
                if(!visited.contains(ke)){
                    visited.add(ke);
                    stack.add(ke);
                }
            }
        }
        return visited.size()==rooms.size();
    }
}