public class Shortest {
    public static String find(String sentence) {
        validate(sentence);
        String[] words = splitIntoWords(sentence);
        return findShortestWord(words);
    }
    private static void validate(String sentence) {
        if (sentence == null || sentence.isBlank()) {
            throw new IllegalArgumentException("Sentence must not be null, empty or blank");
        }
    }
    private static String[] splitIntoWords(String sentence) {
        return sentence.trim().split("\\s+");
    }
    private static String findShortestWord(String[] words) {
        String shortest = words[0];
        for (int word = 1; word < words.length; word++) {
            if (isShorter(words[word], shortest)) {
                shortest = words[word];
            }
        }
        return shortest;
    }
    private static boolean isShorter(String word, String currentShortest) {
        return word.length() < currentShortest.length();
    }
}