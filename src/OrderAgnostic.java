public class OrderAgnostic {
    public static void main(String[] args) {
        int arr[] = {-15,-12,-7,-2,0,1,3,5,6,8,10};
        int target = 6;
        int ans = agnostic(arr,target);
        System.out.println(ans);
    }
    static int agnostic(int arr[],int target)
    {
        int start = 0;
        int end = arr.length-1;
        boolean  isAgnostic = arr[start]>arr[end];
//        if(arr[start]>arr[end])
//        {
//            isAgnostic = true;
//        }
//        else
//        {
//            isAgnostic = false;
//        }
        while(start <= end) {

            int mid = start + (end - start) / 2;

            if(arr[mid] == target)
            {
                return mid;
            }

            if(isAgnostic)
            {
//               descending order
                if (target < arr[mid]) {
                    start = mid + 1;
                }
                else if(target > arr[mid]){
                    end = mid -1;
                }
            }
            else{
//                ascending order
                if (target > arr[mid]) {
                    start = mid + 1;
                }
                else if(target < arr[mid]){
                    end = mid -1;
                }
            }

        }
        return -1;
    }
}
