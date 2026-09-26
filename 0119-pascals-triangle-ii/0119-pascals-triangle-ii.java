class Solution {

    public List<Integer> getRow(int rowIndex) {
        
        List<List<Integer>> pascalTriangle=new ArrayList<>();

        for(int i=0; i<=rowIndex; i++){
            List<Integer> currentRow=new ArrayList<>();

            //leftmost element is always 1
            currentRow.add(1);
            //Calculating the Middle elements
            for(int j=1; j<i; j++){
                int value=pascalTriangle.get(i-1).get(j-1)+pascalTriangle.get(i-1).get(j);
                currentRow.add(value);
            }
            //RightMost Value is always 1
            if(i>0){
                currentRow.add(1);
            }
            pascalTriangle.add(currentRow);
        }
        return pascalTriangle.get(rowIndex);
    }
}