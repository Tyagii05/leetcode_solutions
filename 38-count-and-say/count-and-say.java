class Solution {
    public String countAndSay(int n) {
        // Base case: the 1st element is always "1"
        String result = "1";
        
        // We already have the 1st element, so we run the loop n - 1 times
        for (int i = 2; i <= n; i++) {
            StringBuilder currentStr = new StringBuilder();
            
            // Start counting the first character of the previous string
            int count = 1;
            
            // Loop through the previous string to count identical consecutive characters
            for (int j = 1; j < result.length(); j++) {
                
                // If the current character is the same as the previous one, increment the count
                if (result.charAt(j) == result.charAt(j - 1)) {
                    count++;
                } else {
                    // If the character changes, append the count and the previous character
                    currentStr.append(count).append(result.charAt(j - 1));
                    
                    // Reset the count to 1 for the new character
                    count = 1;
                }
            }
            
            // Don't forget to append the very last group of characters!
            currentStr.append(count).append(result.charAt(result.length() - 1));
            
            // Update the result for the next iteration
            result = currentStr.toString();
        }
        
        return result;
    }
}