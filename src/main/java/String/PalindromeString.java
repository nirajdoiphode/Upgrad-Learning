package String;

public class PalindromeString {
    public static void main(String[] args) {
        String str="A man A plan a _ canal , panama";

        str=str.replaceAll("[^A-Za-z]","").toLowerCase();
        System.out.println(str );

        if(checkPalindrome(str))
            System.out.println("String is Palindrome");
        else
            System.out.println("Not Palindrome !");

    }

    public static boolean checkPalindrome(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){

            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
