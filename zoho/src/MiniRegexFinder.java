public class MiniRegexFinder {

    public static String findMatch(String text, String pattern) {
        for (int i = 0; i < text.length(); i++) {
            String match = matchFromIndex(text, pattern, i);
            if (match != null) {
                return match;
            }
        }
        return "No match found";
    }
    private static String matchFromIndex(String text, String pattern, int start) {
        int tIndex = start;
        int pIndex = 0;
        while (pIndex < pattern.length()) {
            if (pIndex + 1 < pattern.length() && pattern.charAt(pIndex + 1) == '*') {
                char c = pattern.charAt(pIndex);
                while (tIndex < text.length() && text.charAt(tIndex) == c) {
                    tIndex++;
                }
                pIndex += 2; // skip char and '*'
            } else if (pIndex + 1 < pattern.length() && pattern.charAt(pIndex + 1) == '+') {
                char c = pattern.charAt(pIndex);
                int count = 0;
                while (tIndex < text.length() && text.charAt(tIndex) == c) {
                    tIndex++;
                    count++;
                }
                if (count == 0) return null; // must appear at least once
                pIndex += 2; // skip char and '+'
            } else {
                if (tIndex >= text.length() || text.charAt(tIndex) != pattern.charAt(pIndex)) {
                    return null; // mismatch
                }
                tIndex++;
                pIndex++;
            }
        }
        return text.substring(start, tIndex);
    }

    public static void main(String[] args) {
        String text = "abcbbcabb";
        String pattern = "cb*cab+";
        System.out.println(findMatch(text, pattern)); // Output: cbbcabb
    }
}
