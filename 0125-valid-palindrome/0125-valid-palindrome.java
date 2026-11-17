class Solution {
    public boolean isPalindrome(String s) {
int left=0;
int right =s.length()-1;
while(left<right){
   // Skip special characters from left
            if (!((s.charAt(left) >= 65 && s.charAt(left) <= 90) ||
                  (s.charAt(left) >= 97 && s.charAt(left) <= 122) ||
                  (s.charAt(left) >= 48 && s.charAt(left) <= 57))) {
                left++;
                continue;
            }

            // Skip special characters from right
            if (!((s.charAt(right) >= 65 && s.charAt(right) <= 90) ||
                  (s.charAt(right) >= 97 && s.charAt(right) <= 122) ||
                  (s.charAt(right) >= 48 && s.charAt(right) <= 57))) {
                right--;
                continue;
            }

      char ch1 = s.charAt(left);
            char ch2 = s.charAt(right);


            // Convert uppercase to lowercase
            if (ch1 >= 65 && ch1 <= 90) {
                ch1 = (char)(ch1 + 32);
            }

            if (ch2 >= 65 && ch2 <= 90) {
                ch2 = (char)(ch2 + 32);
            }

            if (ch1 != ch2) {
                return false;
            }

            left++;
            right--;    
}
return true;
    }
}