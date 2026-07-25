class Solution {
    public String reverseVowels(String s) {
       
        // Step 1: Convert string to char array for in-place swapping
        char[] word = s.toCharArray();
        
        // Step 2: Set up the two pointers
        int left = 0;
        int right = s.length() - 1;
        
        // A quick lookup string to check if a character is a vowel (both cases!)
        String vowels = "aeiouAEIOU"; 
        
        // Loop until the pointers meet in the middle
        while (left < right) {
            
            // Move left pointer forward until it finds a vowel
            // (We keep checking left < right so the pointer doesn't go out of bounds)
            while (left < right && vowels.indexOf(word[left]) == -1) {
                left++;
            }
            
            // Move right pointer backward until it finds a vowel
            while (left < right && vowels.indexOf(word[right]) == -1) {
                right--;
            }
            
            // Step 4: Both pointers are now on vowels, so let's swap them!
            char temp = word[left];
            word[left] = word[right];
            word[right] = temp;
            
            // Step 5: Move pointers inward to find the next pair
            left++;
            right--;
        }
        
        // Convert the modified char array back to a String
        return new String(word);
    }
}