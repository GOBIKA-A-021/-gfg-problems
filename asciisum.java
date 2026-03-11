import java.util.Scanner;

class asciisum {
    public static int score(String st) {
        int s=0;
        for(int i=0;i<st.length()-1;i++)
        {
            char c=st.charAt(i+1);
            char ch=st.charAt(i);
            s+=Math.abs(c-ch);
            

        }
        return s;
        
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        String st = sc.nextLine();
        int result = score(st);

        System.out.println( result);
     }
}