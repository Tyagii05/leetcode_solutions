class Solution {
    public boolean isAnagram(String s, String t) {
        // 1. If lengths are different, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }
        
        // 2. Create an array of size 26 to act as a tally counter for lowercase letters
        int[] charCounts = new int[26];
        
        // 3. Loop through both strings simultaneously
        for (int i = 0; i < s.length(); i++) {
            // Add 1 for the character in string 's'
            charCounts[s.charAt(i) - 'a']++;
            
            // Subtract 1 for the character in string 't'
            charCounts[t.charAt(i) - 'a']--;
        }
        
        // 4. Verify that every single tally ended up perfectly at 0
        for (int count : charCounts) {
            if (count != 0) {
                // If any letter has a count other than 0, there is a mismatch
                return false; 
            }
        }
        
        // All tallies are 0, meaning the strings are perfect anagrams
        return true;
    }
}