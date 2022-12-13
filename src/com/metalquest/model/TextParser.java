package com.metalquest.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.metalquest.view.View.*;

/*
 * This class should handle all things related to parsing user input.
 */

public class TextParser {
    private Scanner scanner = new Scanner(System.in);

    private String[] userInputParser(String input) {
        if (input.equals("quit") || input.equals("q")) {
            quitOption();
        }
        Pattern wordPattern = Pattern.compile("\\b(I|this|its|and|the|of|a|or|now)\\b\\s?");
        Matcher matchPattern = wordPattern.matcher(input);
        String inputString = matchPattern.replaceAll(" ").
                replaceAll("[\\p{Punct}]", "")
                .trim().replaceAll("[ ]+", " ");

        String[] inputArray = inputString.split(" ");

        if (inputArray.length != 2) {
            System.out.println("You entered an invalid option. Please enter two words [VERB], " +
                    "[NOUN] that describe what action you want to take.");
            String newInput = getUserInput();
            userInputParser(newInput);
        } else {
            String verb = inputArray[0];
            String noun = inputArray[1];

        }
        return inputArray;
    }

    private List<String> keyWordIdentifier(String[] userInputArray) {
        List<String> action = new ArrayList<>();
//
//        String verb = userInputArray[0];
//        String noun = userInputArray[1];
//        if (wordsMap.containsKey(verb.toLowerCase(Locale.ROOT))) {
//            action.add(verb);
//        }
//        for (Map.Entry<String, ArrayList<?>> entry : wordsMap.entrySet()) {
//            for (Object synonyms : entry.getValue()) {
//                if (synonyms.equals(verb.toLowerCase(Locale.ROOT))) {
//                    action.add(entry.getKey());
//                }
//            }
//        }
//        action.add(noun);
        return action;
    }
}