package iwanczukp.excercises.ciphers;

class CiphersTest {

    public static void main(String[] args) {

        String message = "KURS PROGRAMOWANIA W JAVIE XYZ";

        String encrypted = CesarCipher.encrypt(message);
        String decrypted = CesarCipher.decrypt(encrypted);

        System.out.println("Wiadomość: " + message);
        System.out.println("Po zaszyfrowaniu: " + encrypted);
        System.out.println("Po odszyfrowaniu: " + decrypted);
    }

}
