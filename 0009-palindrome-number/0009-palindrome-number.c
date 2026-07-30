bool isPalindrome(int x) {
    long int palindrome = 0, rem=0;
    int original = x;
    while(x>0)
    {
        rem = x%10;
        palindrome = palindrome*10+rem;
        x = x/10;
    }
    if(palindrome == original)
        return true;
    else
        return false;
}