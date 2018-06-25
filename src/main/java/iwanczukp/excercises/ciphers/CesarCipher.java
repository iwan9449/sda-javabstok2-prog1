package iwanczukp.excercises.ciphers;

class CesarCipher {

    static String encrypt(String text) {
        char [] textAsCharArray = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                textAsCharArray[i] = getEncryptedChar(text.charAt(i));
            }
        }
        return String.valueOf(textAsCharArray);
    }

    static String decrypt(String text) {
        char [] textAsCharArray = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                textAsCharArray[i] = getDecryptedChar(text.charAt(i));
            }
        }
        return String.valueOf(textAsCharArray);
    }

    private static char getEncryptedChar(char c) {
        return (char) (65 + ((int) c - 62) % 26);
    }

    private static char getDecryptedChar(char c) {
        return (char) (65 + ((int) c - 42) % 26);
    }

}
