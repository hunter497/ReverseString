public class ReverseString {
    public static String reverse(String s) {
        int n = s.length();
        if (n <= 1) return s;
        String a = s.substring(0, n/2);
        String b = s.substring(n/2, n);
        return reverse(b) + reverse(a);
    }
    
    public static void main(String[] args) {
        String normalString = new String(args[0]);
        String reversedString = new String();
        reversedString = reverse(normalString);
        System.out.println(reversedString);
    }
}