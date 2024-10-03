package application;

public class App {
    /*
     * Multidimensional Arrays
     */
    public static void main(String[] args) {
        String[][] texts = {
            {"one", "two", "three"},
            {"four", "five", "six"},
            {"seven", "eight", "nine"}
        };

        for(int i = 0; i<texts.length;i++){
            String[] subArray = texts[i];

            for(int j = 0; j < subArray.length;j++){
                System.out.printf("%s\t",subArray[j]);
            }
            System.out.println();
        }
    }
}