import java.util.ArrayList;
import java.util.List;

public class findThePeaks {
    public List<Integer> findPeaks(int[] mountain) {
        ArrayList<Integer> peakIndex = new ArrayList<>();
        for (int i = 1; i < mountain.length - 1; i++) {
            if (mountain[i] > mountain[i - 1] && mountain[i] > mountain[i + 1]) {
                peakIndex.add(i);
            }
        }

        return peakIndex;
    }
}
