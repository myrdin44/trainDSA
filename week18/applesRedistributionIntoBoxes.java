import java.util.Arrays;

public class applesRedistributionIntoBoxes {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sumApples = 0;
        for (int fruit : apple) {
            sumApples += fruit;
        }

        Arrays.sort(capacity);
        int neededBox = 0;
        int totalCapacity = 0;

        for (int i = capacity.length - 1; i > -1; i--) {
            totalCapacity += capacity[i];
            neededBox++;

            if (totalCapacity >= sumApples) {
                return neededBox;
            }
        }

        return neededBox;
    }
}
