public class FirstandLastElements {
    public static void main(String[] args) {
        
        int[] arr = {4,4,4,5,5,5,7,7,7,7,8};
        int target = 5;
        int[] ans = searchFirstandLast(arr,target);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }

    public static int[] searchFirstandLast(int arr[],int target) {

        int[] ans = {-1, -1};

        ans[0] = firstandlast(arr,target,true);
        ans[1] = firstandlast(arr,target,false);
        return ans;
    }

      static int firstandlast(int nums[],int target,boolean firstelement) {
          int ans = -1;
          int start = 0;
          int end = nums.length - 1;

          while (start <= end) {
              int mid = start + (end - start) / 2;

              if (target < nums[mid]) {
                  end = mid - 1;
              } else if (target > nums[mid]) {
                  start = mid + 1;
              } else if (target == nums[mid]) {
//                potential answer is found
                  ans = mid;
                  if (firstelement) {
                      end = mid - 1;
                  } else {
                      start = mid + 1;
                  }
              }

          }
          return ans;
      }
}
