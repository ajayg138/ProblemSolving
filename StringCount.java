class StringCount {
    public int possibleStringCount(String word) {
        int count = 1;  
        char lastChar = word.charAt(word.length() - 1);

        
        for (int i = word.length() - 2; i >= 0; i--) {
            if (word.charAt(i) != lastChar) {
                count++;
                lastChar = word.charAt(i);  
            }
        }

        return count;
    }
}
