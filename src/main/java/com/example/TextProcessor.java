public class TextProcessor {

    public int countWords(String input) {
        if (input == null) {
            return 0;
        }
        String trimmedInput = input.trim();
        String[] words = trimmedInput.split(" +");
        return words.length;
    }

}