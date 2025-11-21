package com.sortingalgorithms;



public class SentenceSearch {

    public static String findSentence(String[] sentences, String word) {
        for (String s : sentences)
            if (s.toLowerCase().contains(word.toLowerCase()))
                return s;
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] data = {
                "The weather is nice today",
                "Java is a powerful programming language",
                "Linear search is simple",
                "We are learning algorithms"
        };

        String result = findSentence(data, "java");
        System.out.println(result);
    }
}
