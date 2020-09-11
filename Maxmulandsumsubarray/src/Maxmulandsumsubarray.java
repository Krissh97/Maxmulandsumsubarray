public class Maxmulandsumsubarray {
    public static void main(String args[]){
        int[] arr = {-5,10,20,-8, 8, -4, 10};
        System.out.println("Maximum subarray sum is:"+maxsum(arr));
        System.out.println("Maximum subarray multiplication is:"+maxmul(arr));

    }
    public static int maxsum(int[] nums){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            max = Math.max(max, sum);
            if(sum<0)
                sum=0;
        }
        return max;
    }
    public static int maxmul(int[] nums){
        int prod = 1;
        int result = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {
            prod = prod * nums[i];
            result = Math.max(prod, result);
            if(prod == 0) {
                prod = 1;
            }
        }
        prod = 1;

        for(int i = nums.length - 1; i >= 0; i--) {

            prod = prod * nums[i];
            result = Math.max(prod, result);
            if(prod == 0) {
                prod = 1;
            }
        }
        return result;
    }
}
