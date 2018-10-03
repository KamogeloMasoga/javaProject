/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IE8;

/**
 *
 * @author Reverside
 */
public class ReplaceUnderscore {

    private static final char UNDERSCORE = '_';
    private static final char SPACE = ' ';

    public static String replace(String input) {

        if (input.isEmpty()) {
            return input;
        }
        StringBuilder output = new StringBuilder();
        char prevChar = input.charAt(0);
        if (prevChar == UNDERSCORE) {
            output.append(SPACE);
        } else {
            output.append(prevChar);
        }
        for (int i = 1; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == UNDERSCORE) {
                if (currentChar != prevChar) {
                    output.append(SPACE);
                }
            } else {
                output.append(currentChar);
            }
            prevChar = currentChar;
        }
        return output.toString();
    }
}