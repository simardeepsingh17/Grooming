package week2;

public class RemovePalindrome {
    static boolean isPalindrome(String str)
{
    
    int l = 0;
    int h = str.length() - 1;
 
   
    while (h > l)
        if (str.charAt(l++) != str.charAt(h--))
            return false;
 
    return true;
}
 

static int minRemovals(String str)
{
    // If string is empty
    if (str == "")
        return 0;
 
    // If string is palindrome
    if (isPalindrome(str))
        return 1;
 
    // If string is not palindrome
    return 2;
}
 

public static void main (String[] args)
{
    System.out.println (minRemovals("01001000"));
   
         
}
}
