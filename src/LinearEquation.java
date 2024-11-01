public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public LinearEquation(int x1, int y1, int x2, int y2){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
    }
    public double distance(){
        double distance=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        return Math.round(distance * 100.0) / 100.0;

    }
    public double yIntercept(){
        double yInt;
        yInt= y1-(slope()*x1);
        return Math.round(yInt * 100.0) / 100.0;
    }
    public double slope(){
        double numerator= (double) y2-y1;
        double denominator= (double)x2-x1;
        double slope= numerator/denominator;
        return Math.round(slope * 100.0) / 100.0;
    }
    public String equation(){

    }
}
