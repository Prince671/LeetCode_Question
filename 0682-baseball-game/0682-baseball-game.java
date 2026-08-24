class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> values = new ArrayList<>();
        for (int i = 0; i < operations.length; i++) {
            String currVal = operations[i];          
            if (currVal.equals("D")) {
                if (!values.isEmpty()) {
                    values.add(values.get(values.size() - 1) * 2);
                }
            } else if (currVal.equals("C")) {
                if (!values.isEmpty()) {
                    values.remove(values.size() - 1);
                }
            } else if (currVal.equals("+")) {
                if (values.size() >= 2) {
                    int last = values.get(values.size() - 1);
                    int secondLast = values.get(values.size() - 2);
                    values.add(last + secondLast);
                }
            } else {
                values.add(Integer.parseInt(currVal));
            }
        }
        int sum=0;
        for(int val:values){
          sum+=val;
        }
        return sum;
    }
}