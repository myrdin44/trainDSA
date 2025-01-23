package week17;

public class numberOfSeniorCitizens {
    public int countSeniors(String[] details) {
        int count = 0;

        for (String detail : details) {
            String parse = detail.substring(11,13);
            int age = Integer.parseInt(parse);

            if (age > 60) {
                count++;
            }
        }

        return count;
    }
}
