public class Maxmulandsumsubarray {
    public static void main(String args[]){
        int[] arr = {-1,2,3,-4,5,10};

        System.out.println("Maximum subarray sum is:"+maxsum(arr));
        System.out.println("Maximum subarray multiplication is:"+maxmul(arr));
        System.out.println("Maximum subsequence sum is:"+maxsumsubseq(arr));


    }
    public static int maxsumsubseq(int[] nums){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=0)
                continue;
            sum += nums[i];
            //max = Math.max(max, sum);
//            if(sum<max)
//                sum -= nums[i];
        }
        return sum;
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
