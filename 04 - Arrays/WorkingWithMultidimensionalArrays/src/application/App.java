package application;

public class App {
    /*
     * Working with multidimensional arrays
     */
    public static void main(String[] args) {
        String[][] texts = {
            {"one", "two", "three"},
            {"four", "five", "six"},
            {"seven", "eight", "nine"}
        };

        for(int i = 0; i<texts.length;i++){
            for(int j = 0; j < texts[i].length;j++){
                System.out.printf("%s\t",texts[i][j]);
            }
            System.out.println();
        } 
    }
}