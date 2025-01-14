package week16;

public class categorizeABoxAccordingToCriteria {
    public String categorizeBox(int length, int width, int height, int mass) {
        boolean isBulky = false;
        boolean isHeavy = false;
        long volume = (long)length * (long)width * (long)height;
        if (length >= 10000 || width >= 10000 || height >= 10000 || volume >= 1000000000) {
            isBulky = true;
        }

        if (mass >= 100) {
            isHeavy = true;
        }

        if (isBulky && isHeavy) {
            return "Both";
        } else if (isBulky && !isHeavy) {
            return "Bulky";
        } else if (!isBulky && isHeavy) {
            return "Heavy";
        }

        return "Neither";
    }
}
