public class evenDigits {
    public static void main(String[] args) {
    int arr[] = {1,121,2243,67,9,221};
    int ans = findNumbers(arr);
        System.out.println(ans);
    }
    static int findNumbers(int nums[])
    {
        int count = 0;
        for (int num:nums) {
            if(even(num))
            {
                count++;
            }
        }
        return count;
    }
    static boolean even(int number){
        int numberofDigits = digits(number);

        if(numberofDigits % 2 ==0){
            return true;
        }
        return false;
    }

//    count number of digits in number
    static int digits(int nums)
    {
        int count =0;
        while (nums > 0){
            count++;
            nums = nums/10;
        }

        return count;
    }
}
