public class typeOfTriangle {
    public String triangleType(int[] nums) {
        int s1 = nums[0];
        int s2 = nums[1];
        int s3 = nums[2];

        if ((s1 + s2 <= s3) || (s1 + s3 <= s2) || (s2 + s3 <= s1)) {
            return "none";
        }

        if (s1 == s2 && s2 == s3) {
            return "equilateral";
        } else if (s1 == s2 || s2 == s3 || s1 == s3) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }
}
