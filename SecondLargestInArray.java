class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max=arr[0];
        int second=-1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max){
                second=max;
                max=arr[i];
            }
            else if(arr[i]>second&&arr[i]!=max)
            {
                second=arr[i];
                
            }
        }
        return second;
        
    }
}
