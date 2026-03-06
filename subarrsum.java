import java.util.*;

class subarrsum{
    static ArrayList<Integer> subarraySum(int[] arr, int target) {

        ArrayList<Integer> res = new ArrayList<>();
        int sum = 0;
        int start = 0;

        for(int end = 0; end < arr.length; end++) {

            sum += arr[end];

            while(sum > target) {
                sum -= arr[start];
                start++;
            }

            if(sum == target) {
                res.add(start + 1);
                res.add(end + 1);
                return res;
            }
        }

        res.add(-1);
        return res;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,7,5};
        int target=12;
        ArrayList<Integer> result=subarraySum(a,target);
        System.out.println(result);
        }
}