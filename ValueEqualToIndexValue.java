

//User function Template for Java
//Given an array Arr of N positive integers. 
//Your task is to find the elements whose value is equal to that of its index value 
//( Consider 1-based indexing ).

class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here
        
        ArrayList<Integer>l = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(i+1==arr[i])
                l.add(arr[i]);
        }
        return l;
    }
}
