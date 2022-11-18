public class Infinity {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,7,9,11,13,15,19};
        int target = 12;
        System.out.println(findingRange(arr,target));
    }
    static int findingRange(int arr[],int target){
//        first element
//        end of the array
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int newStart = end + 1;
//            double the box value
//            end = previous end + sizeOfBox * 2;
            end = end + (end-start+1)*2;
            start = newStart;
        }
        return binarysearch(arr,target,start,end);
    }
    static int binarysearch(int[] arr,int target,int start,int end){

        while(start<=end){
            int mid = start + (end-start)/2;
            if(target < arr[mid]){
                end = mid -1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
