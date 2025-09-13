public class PalindromeChecker {
    // Private attribute
    private String text;

    // Constructor
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if it's a palindrome
    public boolean isPalindrome() {
        // 1. Sanitize the string: remove punctuation/spaces, set to lowercase.
        String cleanText = this.text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // 2. Create a reversed version of the clean text
        String reversedText = new StringBuilder(cleanText).reverse().toString();

        // 3. Compare them
        return cleanText.equals(reversedText);
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("The text \"" + this.text + "\" IS a palindrome.");
        } else {
            System.out.println("The text \"" + this.text + "\" is NOT a palindrome.");
        }
    }

    // --- Main method to test THIS class ---
    public static void main(String[] args) {
        // Test 1: A complex palindrome
        PalindromeChecker checker1 = new PalindromeChecker("A man, a plan, a canal: Panama");
        checker1.displayResult();

        // Test 2: A simple non-palindrome
        PalindromeChecker checker2 = new PalindromeChecker("Hello World");
        checker2.displayResult();

        // Test 3: A simple palindrome
        PalindromeChecker checker3 = new PalindromeChecker("Racecar");
        checker3.displayResult();
    }
}