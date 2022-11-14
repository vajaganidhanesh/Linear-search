public class floorOfNumber {
    public static void main(String[] args) {
        int arr[] = {12,33,44,55,66,77,89};
        int target = 22;
        int ans = floor(arr,target);
        System.out.println(ans);
    }
//    floor number : greatest number in an array that is less than or equal to the target number

    static int floor(int arr[],int target) {
        int start =0;
        int end =arr.length-1;
        while (start <= end)
        {
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else
                return mid;
        }
        return end;
    }
}
