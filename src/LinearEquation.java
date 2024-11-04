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
        return roundedToHundredth(distance);

    }
    public double yIntercept(){
        double yInt;
        yInt= y1-(slope()*x1);
        return roundedToHundredth(yInt);
    }
    public double slope(){
        double numerator= (double) y2-y1;
        double denominator= (double)x2-x1;
        double slope= numerator/denominator;
        return roundedToHundredth(slope);
    }
    public String equation() {
        int numerator = y2 - y1;
        int denominator = x2 - x1;
        double slope = numerator / denominator;
        double yInt = yIntercept();
        String result = "y = ";
        if (Math.abs(numerator) % Math.abs(denominator) == 0) {
            int intSlope = (int) slope;
            if (intSlope == 1) {
                result += "x";
            } else if (intSlope == -1) {
                result += "-x";
            } else if (intSlope==0){
                // blank because I do not wish to add anything
            } else{
                result += intSlope + "x";
            }
        } else {
            if (numerator < 0 && denominator < 0) {
                result += (-numerator) + "/" + (-denominator) + "x";
            } else if (numerator < 0 || denominator < 0) {
                result += "-" + (Math.abs(numerator)) + "/" + (Math.abs(denominator)) + "x";
            } else {
                result += (numerator) + "/" + (denominator) + "x";
            }
        }
        if (yInt > 0 && slope==0) {
            result +=  yInt;
        }else if (yInt==0){
            //dont add anything
        }else if(yInt>0){
            result += " + " + yInt;
        }else if (yInt < 0) {
            result += " - " +  Math.abs(yInt);
        }
        return result;
    }

    public String coordinateForX(double x){
        if(x2-x1!=0){
        double yVal= (slope()*x)+yIntercept();
        return "("+x+", "+roundedToHundredth(yVal)+")";
        } else{
            return "";
        }
    }
    public String lineInfo() {
        if (x2 - x1 == 0) {
           return "Mate, that line you have here has an undefined slope. Its a vertical line where x= "+x1;
        } else {
            return "The two points are: " + "(" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")\n" +
                    "The equation of the line between these points is: " + equation() + "\n" +
                    "The slope of this line is: " + slope() + "\n" +
                    "The y-intercept of this line is: " + yIntercept() + "\n" +
                    "The distance between the points is " + distance();
        }
    }
    public double roundedToHundredth(double toRound){
        return Math.round(toRound * 100) / 100.0;
    }
}
