package com.tw.academy.basic.$4_naming.practiceTwo;

public class PigLatin {

    public static final String REGEX_SPACE = " ";
    public static final String DELIMITER_SPACE = " ";

    //Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
    public static String pigIt(String sentence) {
        String[] punctuationMarks={".",",","-",":",";","!","?"};
        String[] words = sentence.split(REGEX_SPACE);
        char needMoveToEndChart;
        boolean hasPunctuationMarkFlag = false;

        for (int index = 0; index < words.length; index++){
            for (String punctuationMark : punctuationMarks)
                if (words[index].contains(punctuationMark)) {
                    hasPunctuationMarkFlag = true;
                    break;
                }

            if (!hasPunctuationMarkFlag){
                needMoveToEndChart = words[index].charAt(0);
                words[index] = words[index].substring(1);
                words[index] = words[index].replace(words[index], words[index] + needMoveToEndChart + "ay");
            }
            hasPunctuationMarkFlag = false;
        }

        return String.join(DELIMITER_SPACE, words);
    }
}
