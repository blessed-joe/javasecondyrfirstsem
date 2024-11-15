/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    	
         String[][] numbers = {
             {"one", "two", "three"},
             {"four", "five", "six"},
             {"seven", "eight", "nine"}
        };
        
        for(int i = 0; i<numbers.length;i++){
            for(int j = 0; j<numbers[0].length;j++) {
                System.out.print(numbers[i][j]+ " ");
            }
                System.out.println();
            }
        
	}
}