
class caesar {

    static char[] alphaCreator() { // method that returns an array of capital alphabets

        char[] alphabets = new char[26]; // array that stores all alphabets

        for (int index = 0, ascii = 65; index < 26; index++, ascii++) { // adding all alphabets to an array

            alphabets[index] = (char) ascii;
        }

        return alphabets;

    }
    // --------------------------

    static String filterMessage(String message) {

        String outMessage = "";

        for (int i = 0; i < message.length(); i++) {

            if (message.charAt(i) == ' ' | ((int) message.charAt(i) >= 65) & ((int) message.charAt(i) <= 122)) {
                outMessage += Character.toUpperCase(message.charAt(i));
            }
        }

        return outMessage;
    }

    static char[] withStep1(char[] alphabets) {

        char[] newAlphabets = new char[26];

        for (int i = 0; i < alphabets.length - 1; i++) {
            newAlphabets[i] = alphabets[i + 1];
        }

        newAlphabets[25] = alphabets[0];

        return newAlphabets;
    }

    static int indexOf(char[] arr, char element) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }

        }
        return 0;
    }

    // --------------------------

    static String inputValue(String message, int step) { // run this method to get output(message, step)

        String outputMessage = ""; // for final string out

        String filteredMessage = filterMessage(message);

        char[] alphabetsReference = alphaCreator(); // no changing alphabets

        char[] alphabets = alphaCreator(); // array that go through changes

        for (int i = 0; i < step; i++) { // loop that shifts elements by number of steps
            alphabets = withStep1(alphabets);
        }

        for (int i = 0; i < filteredMessage.length(); i++) {
            if (filteredMessage.charAt(i) == ' ') {
                outputMessage += ' ';
            }

            else {
                int index = indexOf(alphabetsReference, filteredMessage.charAt(i));
                outputMessage += alphabets[index];
            }
        }

        return outputMessage;
    }

    public static void main(String[] args) {

    }
}
