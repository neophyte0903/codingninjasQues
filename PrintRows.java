public class Solution {
    public static int[] printRowWise(int [][]a) {
        // Write your code here.
        int numRows = a.length;
    int numCols = a[0].length;
    int[] result = new int[numRows * numCols];
    int index = 0;

    for (int i = 0; i < numRows; i++) {
        for (int j = 0; j < numCols; j++) {
            // Print the current element
            
            
            // Store the current element in the result array
            result[index++] = a[i][j];
        }
        // Move to the next row
        
    }

    // Return the result array
    return result;
        }
    }
