class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        Arrays.sort(arr2);
        int count = 0;

        for(int i = 0; i<arr1.length; i++){
            int left = 0; int right = arr2.length -1 ;
            boolean validPair = false;
            while(left <= right){
                int mid = left + (right-left ) / 2;

                if(Math.abs(arr2[mid] - arr1[i]) <= d){
                    validPair = true;
                    break;
                }

                if(arr2[mid] < arr1[i]){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
            }

            if(!validPair){
                count++;
            }
        }

        return count;
    }
}