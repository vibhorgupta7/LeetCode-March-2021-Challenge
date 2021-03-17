// Generate Random Point in a Circle

class Solution {
    
    double radius;
    double x_center;
    double y_center;
    
    public Solution(double radius, double x_center, double y_center) {
        this.radius=radius;
        this.x_center=x_center;
        this.y_center=y_center;
    }
    
    public double[] randPoint() {
        // x= r*cos(Q);
        // y= r*sin(Q);
        // r lies in [0,radius];
        // Q lies in [0,2pi];
        // but the conentration of points will be alot in the center, to remove that we take aquare root           of r
        
        double r = Math.sqrt(Math.random()) * radius;
        double Q = Math.random() * 2 * Math.PI;
        
        double x = x_center + r * Math.cos(Q);
        double y = y_center + r * Math.sin(Q);
        
        double ans[] = new double[2];
        ans[0]=x;
        ans[1]=y;
        
        return ans;
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(radius, x_center, y_center);
 * double[] param_1 = obj.randPoint();
 */