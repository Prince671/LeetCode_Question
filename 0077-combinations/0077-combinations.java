class Solution {
    static void getCombination(int arr[], int index, int k, List<List<Integer>> ans, List<Integer> combination){
        if(combination.size()==k){
            ans.add(new ArrayList<>(combination));
            return ;
        }
        if(index>=arr.length){
            return;
        }
        //including the value
        combination.add(arr[index]);
        //calling the function with value 
        getCombination(arr, index+1, k, ans, combination);
        //exluding the value;
        combination.remove(combination.size()-1);
        getCombination(arr, index+1, k, ans, combination);
    }
    public List<List<Integer>> combine(int n, int k) {
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
          arr[i]=i+1;
        }
        System.out.println(Arrays.toString(arr));
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();


        getCombination(arr,0, k, ans, combination);
        return ans;
    }
}