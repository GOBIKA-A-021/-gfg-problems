public class secondlarge {
    public static int getSecondLargest(int[] arr) {
        int first = -1;
        int second = -1;
        
        for(int num : arr) {
            if(num > first) {
                second = first;
                first = num;
            }
            else if(num > second && num != first) {
                second = num;
            }
        }
        
        return second;
    }
     public static void main(String[] args) {
        int a[]={1,2,4,5,6,7,8,9,10};
        int a1= getSecondLargest(a);
        System.out.println(a1);

}
}
    

