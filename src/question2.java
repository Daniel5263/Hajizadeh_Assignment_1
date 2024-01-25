public class question2 {
    public static void main(String[] args) {
        char[] text1 = "spy family".toCharArray();
        char[] text2 = "jujutu kaien".toCharArray();
        System.out.print(longestCommonSubstring(text1, text2));
    }

    public static String longestCommonSubstring(char[] text1, char[] text2) {
        int[][] dp = new int[text1.length + 1][text2.length + 1];

        int max = 0;
        int end = 0;

        for (int i = 1; i <= text1.length; i++) {
            for (int j = 1; j <= text2.length; j++) {
                if (text1[i - 1] == text2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;

                    //Update the maximum length and the end position of the longest common substring
                    if (dp[i][j] > max) {
                        max = dp[i][j];
                        end = i - 1;
                    }
                }
            }
        }
        if (max == 0) {
            return "";
        }
        String str1 = new String(text1);
        return str1.substring(end - max + 1, end + 1);
    }
}