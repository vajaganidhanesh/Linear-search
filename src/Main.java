public class Main {
    public static void main(String[] args) {
        int[] arr = {11,23,42,54,65,32};
        int target = 32;
        int ans = LinearSearch(arr,target,1,5);
        System.out.println(ans);
    }
    static int LinearSearch(int arr[],int target,int start,int end){
        if(arr.length == 0)
            return 1;

        for (int index = start; index <=end; index++) {
            int element = arr[index];
            if(element == target)
                return index;
        }
        return -1;
    }
}