class stringsubseu {
    public static int append(String s, String t) {
        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                j++;
            }
            i++;
        }
        return t.length() - j;
        }
        public static void main(String[] args) {

        String s = "coaching";
        String t = "coding";

        int result = append(s, t);

        System.out.println(result);
    }
}