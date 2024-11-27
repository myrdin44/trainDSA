package week9;

public class firstBadVersion {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            // check mid 
            if (isBadVersion(mid)) {
                right = mid; 
            } else {
                left = mid + 1;
            }
        }
        
        return left;
    }
}
