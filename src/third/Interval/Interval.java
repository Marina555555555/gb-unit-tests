package src.third.Interval;

public class Interval {
    public boolean numberInInterval(int n) {
        if (n <= 25) {
            return false; 
        }
        if (n >= 100) {
            return false; 
        }
        
        return true;
    }
}
