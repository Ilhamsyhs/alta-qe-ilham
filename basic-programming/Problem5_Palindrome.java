import java.sql.SQLOutput;

public class Problem5_Palindrome {
    private static boolean parlindrome(String value){
        String reverse = "";
        int i;
        for (i = value.length()-1; i >= 0; i--){
            reverse = reverse + value.charAt(i);
        }
        if (value.equals(reverse)){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(parlindrome("permata"));
    }

}
