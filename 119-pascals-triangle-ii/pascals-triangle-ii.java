class Solution {
    public List<Integer> getRow(int rowIndex) {
        int r = rowIndex;
        List<List<Integer>> list = new ArrayList<>();

        list.add(new ArrayList<>(Arrays.asList(1)));

        for (int i = 1; i <= r; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    temp.add(1);
                } else {
                    int sum = list.get(i - 1).get(j - 1) + list.get(i - 1).get(j);
                    temp.add(sum);
                }
            }
            list.add(temp);
        }

        return list.get(r);
    }
}