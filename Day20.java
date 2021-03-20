// Design Underground System


class UndergroundSystem {
    
    HashMap<Integer,event> map1;
    HashMap<String,averages> map2;
    private final String DELIMETER = ",";

    public UndergroundSystem() {
        map1=new HashMap<>();
        map2=new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        map1.put(id,new event(id,stationName,t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        event a=map1.get(id);
        map1.remove(id);
        
        int diff = t - a.t;
        
        String key = a.stationName + DELIMETER + stationName;
        
        averages avg = map2.containsKey(key)? map2.get(key) : new averages();
        
        avg.updateAverages(diff);
        
        map2.put(key,avg);
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String key = startStation + DELIMETER + endStation;
        averages ans=map2.get(key);
        
        return ans.getAverages();
    }
    
    class event{
        int id, t;
        String stationName;
        
        public event(int id,String stationName,int t){
            this.id=id;
            this.stationName=stationName;
            this.t=t;
        }
    }
    
    class averages{
        String name;
        double total;
        int count;
        
        public averages(){
            name="";
            total=0;
            count=0;
        }
        
        public void updateAverages(int diff){
            total+=diff;
            count++;
        }
        
        public double getAverages(){
            return total/count;
        }
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */