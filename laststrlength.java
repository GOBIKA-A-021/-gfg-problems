public class laststrlength {
    public static int lenlastWord(String s) {
        String ar[]=s.split(" ");
        String st=ar[ar.length-1];
        int l=st.length();
        return l;      
    }
    public static void main(String[] args) {
    String s="I love coding";
    int ans=lenlastWord(s);
    System.out.println(ans);
}

}
    

