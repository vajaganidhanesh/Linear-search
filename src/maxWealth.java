public class maxWealth {
    public static void main(String[] args) {
        int [][]arr = {{1,23,4},{2,1,3}};
        int ans = maxiumWealth(arr);
        System.out.println(ans);

    }
    static int maxiumWealth(int[][] accounts){

        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum +=accounts[person][account];
            }
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
