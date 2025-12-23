public class MaxVowels {
    public static void main(String[] args) {
        String s = "us";
        int k = 3;

        int count = 0, max = 0;

        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) count++;

            if (i >= k) {
                if (isVowel(s.charAt(i - k))) count--;
            }

            max = Math.max(max, count);
        }

        System.out.println("Max vowels = " + max);
    }

    static boolean isVowel(char c) {
        return "io".indexOf(c) != -1;
    }
}