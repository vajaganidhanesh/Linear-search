public class ceilingOfNumber {

    public static void main(String[] args) {
        int arr[] = {2,4,5,7,8,10};
        int target = 6;
        int ans = celingNumber(arr,target);
        System.out.println(ans);
    }
//    function for ceiling index value which is smaller element in array greater than or equal to target
    static int celingNumber(int[] arr,int target){
        if(target > arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        boolean isAgnostic = arr[start] > arr[end];

        while(start <= end)
        {
            int mid = start + (end - start)/2;

            if(isAgnostic){
//                for ascending order
                if (target > arr[mid]){
                    start = mid+1;
                }
                else if(target < arr[mid]){
                    end = mid-1;
                }
            }
            else{
                return mid;
            }

        }
        return start;
    }
}
