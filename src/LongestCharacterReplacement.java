public class LongestCharacterReplacement{
    public int characterReplacement(String s, int k) {
        int maxLength = 0;
        for (char c = 'A'; c <= 'Z'; c++) {
            int cs = 0 ,end = 0,start = 0,ctr = 0,maxWindowLength = 0;
            char[] str = s.toCharArray();

            while(end < str.length) {
                if (str[end] == c) {
                    cs++;
                } else {
                    if (ctr < k) {
                        cs++;
                        ctr++;
                    } else {
                        while(str[start] == c) {
                            // shrink window
                            start++;
                            cs--;
                        }
                        start++;
                    }
                }
                maxWindowLength = Math.max(cs,maxWindowLength);
                end++;
            }
            maxLength = Math.max(maxLength, maxWindowLength);
        }
        return maxLength;
    }
}

// AABBAB
    // AABBAAAA
    // k = 1
    // 

// AABBAAA
// k = 2