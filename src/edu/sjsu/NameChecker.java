package edu.sjsu;

public class NameChecker {
    /**
     * Checks if a given string is a valid input following these rules:
     * - Between 2 to 40 characters
     * - Contains only alphabetic characters, non-consecutive hyphens, or a single quote
     * - Cannot start with a hyphen or single quote
     * 
     * @param input input to check
     * @return True if input is a valid input, else false
     */
    public static boolean check(String input) {{
        // Check length
        if (input.length() < 2 || input.length() > 40) {
            return false;
        }
        
        // Check characters
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!Character.isLetter(ch) && ch != '-' && ch != '\'' 
                || (ch == '-' || ch == '\'') && (i == 0 || i == input.length() - 1)) {
                return false;
            }
            if ((ch == '-' || ch == '\'') && i > 0) {
                char prevChar = input.charAt(i - 1);
                if (prevChar == '-' || prevChar == '\'') {
                    return false;
                }
            }
        }
        
        return true;
    }
    }
}
