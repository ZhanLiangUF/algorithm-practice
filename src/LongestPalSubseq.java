public class LongestPalSubseq {

    public int longestPalindromeSubseq(String seq) {
       if (seq.length() == 1) {
           return 1;
       }
       if (seq.length() == 2 && seq.charAt(0) == seq.charAt(seq.length()-1)) {
           return 2;
       }

       if (seq.charAt(0) == seq.charAt(seq.length()-1)) {
           return longestPalindromeSubseq(seq.substring(1,seq.length()-1)) + 2;
       } else {
           return Math.max(longestPalindromeSubseq(seq.substring(0,seq.length()-1)), longestPalindromeSubseq(seq.substring(1,seq.length())));
       }

    } 
}
