package application;

public class MultidimensionalArrays {
    public static void main(String[] args) {

        String[][] texts = {
                { "one", "two", "three" },
                { "four", "five", "six" },
                { "seven", "eight", "night" }
        };

        for (int i = 0; i < texts.length; i++) {
            String[] subArray = texts[i];

            for (int j = 0; j < subArray.length; j++) {
                System.out.printf(subArray[i]);
            }
        }

    }
}