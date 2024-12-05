package week10;

public class construcTheRectangle {
    public int[] constructRectangle(int area) {
        int W = (int) Math.sqrt(area);
        
        while (area % W != 0) {
            W--;
        }
        
        int L = area / W;
        
        return new int[]{L, W};
        }
}
