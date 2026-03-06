import java.util.*;
class missingnumber{
     static int missingNum(int a[]) {
        int c=0;

        Arrays.sort(a);
        int n=a[a.length-1];
        int ac=n*(n+1)/2;
        for(int i=0;i<a.length;i++)
        {
            c+=a[i];
        }
        int ans=ac-c;
        return ans;
    
        
        
        
    }
    public static void main(String[] args) {
        int a[]={1,2,4,5,6,7,8,9,10};
        int a1=missingNum(a);
        System.out.println(a1);




        
    }
}