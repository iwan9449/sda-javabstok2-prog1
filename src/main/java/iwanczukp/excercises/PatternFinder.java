package iwanczukp.excercises;

import iwanczukp.utils.Generator;

import java.util.ArrayList;
import java.util.List;

class PatternFinder {

    public static void main(String[] args) {
        String text = Generator.generateString(50, 4);
        String pattern = Generator.generateString(3, 4);

        List<TextCoords> textCoords = findPatternInText(text, pattern);
        System.out.println(textCoords);
    }

    private static List<TextCoords> findPatternInText(String text, String pattern) {
        List<TextCoords> textCoords = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int patternLength = pattern.length();
        for (int i = 0; i < text.length() - (patternLength - 1); i++) {
            if (text.substring(i, i + patternLength).equals(pattern)) {
                textCoords.add(new TextCoords(i, i + patternLength));
                sb.append('^');
            } else {
                sb.append(' ');
            }
        }
        System.out.println(pattern);
        System.out.println(text);
        System.out.println(sb.toString());
        return textCoords;
    }

    private static class TextCoords {
        private int begin;
        private int end;

        TextCoords(int begin, int end) {
            this.begin = begin;
            this.end = end;
        }

        public int getBegin() {
            return begin;
        }

        public int getEnd() {
            return end;
        }

        @Override
        public String toString() {
            return "{" +
                    "begin: " + begin +
                    ", end: " + end +
                    '}';
        }
    }

}
