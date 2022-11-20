public class RBS {
    public static void main(String[] args) {
        int arr[] = {3,4,5,6,7,3,2};
        int target = 7;
        int ans = search(arr,target);
        System.out.println(ans);
    }

    static int search(int[] nums,int target){
        int pivot = findPivot(nums);

        if(pivot == -1){
            return binarysearch(nums,target,0,nums.length-1);
        }

        if(nums[pivot] == target){
            return pivot;
        }
        return -1;
    }
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid =start + (end - start)/2;

            if(mid > end && arr[mid] > arr[mid + 1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]){
                return mid-1;
            }
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
    static int binarysearch(int arr[],int target,int start,int end){
        boolean isAgnostic = arr[start] < arr[end];
        while (start <= end){
            int mid = start + (end - start)/2;
            if(isAgnostic){
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else if(target > arr[mid]){
                    start = mid + 1;
                }
            }
            else{
                if(target > arr[mid]){
                    end= mid - 1;
                }
                else if(target < arr[mid]){
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
