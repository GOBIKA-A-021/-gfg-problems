import java.util.*;

class repeatarr {
    public static void getConcatenation(int[] nums) {
        int ans[]=new int[2*nums.length];
        int ind=nums.length;
        for(int i=0;i<nums.length;i++)
        {
             ans[i]=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
             ans[ind]=nums[i];
             ind++;
        }
        
         System.out.println(Arrays.toString(ans) );



    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[]={1,2,3,4};
      
        getConcatenation(nums);

        
    
}
}