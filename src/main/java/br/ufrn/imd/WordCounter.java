package main.java.br.ufrn.imd;

import java.io.*;
import java.util.*;

public class WordCounter {

    public static void main(String[] args) {
        // Path to the file in the assets folder
        String filePath = "src/main/resources/assets/r8_sentences_clean.txt";

        try {
            // Open the file 
            BufferedReader in = new BufferedReader(new FileReader(filePath));

            // Use a Set to store unique words
            Set<String> words = new HashSet<>();
            String line;

            // Read the file line by line
            while ((line = in.readLine()) != null) {
                // Split the line into words
                String[] lineWords = line.split(" ");

                for (String word : lineWords) {
                    if (!word.isEmpty()) {
                        // Add the word to the Set in lowercase to ensure uniqueness
                        words.add(word.toLowerCase());
                    }
                }
            }

            // Close the BufferedReader
            in.close();

            // Display the result
            System.out.println("Number of unique words: " + words.size());

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
