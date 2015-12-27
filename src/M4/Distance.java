package M4;
public class Distance {
    public double theDistanceBetweenPoints(double pointX1,double pointX2, double pointY1, double pointY2){
        return Math.sqrt(Math.pow((pointX2-pointX1),2)+Math.pow((pointY2-pointY1),2));
    }
}
