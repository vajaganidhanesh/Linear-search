public class SearchInMountain {
    public static void main(String[] args) {
    int arr[] = {2,3,5,7,4,1};
    int target = 1;
    int ans = search(arr,target);
    System.out.println(ans);

    }
    static int search(int[] arr,int target){
        int peak = maximumIndex(arr);
        int firstHalf = binarysearch(arr,target,0,peak);
        if(firstHalf!=-1){
            return firstHalf;
        }
        // try to search in second half
        return binarysearch(arr,target,peak+1,arr.length-1);

    }
    static int maximumIndex(int arr[]){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }

    static int binarysearch(int arr[],int target,int start,int end) {
        boolean isAgnostic = arr[start] > arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAgnostic) {
//               descending order
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                }
            }
            else {
//                ascending order
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                }
            }

        }
        return -1;
    }
}
