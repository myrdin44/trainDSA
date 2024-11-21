package week8;

class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        List<Integer> init = new ArrayList<>();
        init.add(1);
        result.add(init);
        if (numRows >= 2) {
            List<Integer> init2 = new ArrayList<>();
            init2.add(1);
            init2.add(1);

            result.add(init2);

            for (int i = 2; i < numRows; i++) {
                List<Integer> currentList = new ArrayList<>();
                for (int k = 0; k <= i; k++) {
                    currentList.add(0);
                }
                currentList.set(0, 1);
                currentList.set(currentList.size() - 1, 1);
                for (int j = 1; j < currentList.size() - 1; j++) {
                    currentList.set(j, result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }

                result.add(currentList);
            }

        }
        return result;

    }
}