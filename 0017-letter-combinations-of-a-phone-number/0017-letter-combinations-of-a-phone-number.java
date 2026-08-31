class Solution {

    public List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();

        if (digits.length() == 0) {
            return result;
        }

        String[] phone = {
            "", "", "abc", "def",
            "ghi", "jkl", "mno",
            "pqrs", "tuv", "wxyz"
        };

        backtrack(0, digits, "", result, phone);

        return result;
    }

    private void backtrack(
        int index,
        String digits,
        String current,
        List<String> result,
        String[] phone
    ) {

        // Combination is complete
        if (index == digits.length()) {
            result.add(current);
            return;
        }

        // Get letters for current digit
        String letters = phone[digits.charAt(index) - '0'];

        // Try every letter
        for (char ch : letters.toCharArray()) {

            // Choose
            backtrack(
                index + 1,
                digits,
                current + ch,
                result,
                phone
            );
        }
    }
}