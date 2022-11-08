import java.util.Arrays;

public class twoDarray {
    public static void main(String[] args) {
        int[][] arr = {
                {23,31,21,33},
                {32,62,71,30},
                {11,13,51,61}
        };

        int target = 11;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr,int target)
    {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {

                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }

        }
        return new int[]{-1,-1};
    }
}

