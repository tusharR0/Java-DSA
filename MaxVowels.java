// public class MaxSumSubarray {
//     public static void main(String[] args) {
//         int[] arr = {2, 1, 5, 1, 3, 2};
//         int k = 3;

//         int windowSum = 0;
//         int maxSum = 0;

//         for (int i = 0; i < arr.length; i++) {
//             windowSum += arr[i];

//             if (i >= k - 1) {
//                 maxSum = Math.max(maxSum, windowSum);
//                 windowSum -= arr[i - (k - 1)];
//             }
//         }

//         System.out.println("Maximum Sum = " + maxSum);
//     }
// }
// 🔸 Maximum Vowels in Substring of Length k
public class MaxVowels {
    public static void main(String[] args) {
        String s = "abciiidef";
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
        return "aeiou".indexOf(c) != -1;
    }
}

