public class binarySearch {
    public static void main(String[] args) {
        int arr[] = {1,3,5,6,8,10};
        int target = 5;
        int ans = binaryMethod(arr,target);
        System.out.println(ans);
    }
    static int binaryMethod(int arr[],int target)
    {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end)
        {
            int mid = start + (end - start)/2;

            if(target < arr[mid])
            {
                end = mid - 1;
            }
            else if(target > arr[mid])
            {
                start = mid + 1;
            }
            else if(target == arr[mid])
            {
                return mid;
            }
        }
        return -1;
    }
}
