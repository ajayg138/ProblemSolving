class StringCount {
    public int possibleStringCount(String word) {
        int count = 1;  // Start with the original word itself as a valid substring
        char lastChar = word.charAt(word.length() - 1);

        // Loop from the end, counting each time the last character changes
        for (int i = word.length() - 2; i >= 0; i--) {
            if (word.charAt(i) != lastChar) {
                count++;
                lastChar = word.charAt(i);  // Update the last character to the new character
            }
        }

        return count;
    }
}
