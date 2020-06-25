package arraysExercises;

import java.util.Arrays;

/**ARRAYS
*
*examples of code on 1dimensional and 2dimensional arrays
*all print arguments have been commented out 
*if you copy all the code and paste it, this will stop your application from printing all the outcomes
*uncomment each exercise individually to understand better the code
*
*/
public class ArraysOneTwoDimension {

	public static void testMethod(int[] numbers) { //passing an array as a parameter alters the original array
		numbers[5] = 25; 
	}
	
	public static void methodTwoDimArr(int[][] d) {
		for(int r = 0; r < d.length; r++) {
			for(int c = 0; c < d[0].length-1; c++) {
				if(d[r][c + 1] > d[r][c]) {
					d[r][c] = d[r][c + 1];
//					System.out.println(Arrays.deepToString(d));
				}
			}
		}
	}
	
	public int[][] addAMatrix(int[][] a, int[][]b) {
		int[][] c = new int[a.length][a[0].length];
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[0].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}
	
	public static void main(String[] args) {

		int[] numbers = new int[8];
		numbers[1] = 4;
		numbers[4] = 99;
		numbers[5] = 2;
		numbers[numbers.length-1] = 0;
		
		System.out.println("Index 7 = " + numbers[7]); //this is the last index of our array numbers
		
		int x = numbers[1];
		numbers[x] = 44;
		numbers[numbers[7]] = 11;
//		System.out.println(numbers[x]);
		
		System.out.println("before using method = " + Arrays.toString(numbers));
		testMethod(numbers); 
//		System.out.println("After using the method testMethod = " + Arrays.toString(numbers));
		
		
		/* TWODIMENSIONAL ARRAYS
			three examples of how to use two dimensional arrays
		*/
		int count = 0;
		
		int[][] twoDimensionalArr = new int[5][7];
		for(int row = 0; row < twoDimensionalArr.length; row++) {
			for(int col = 0; col< twoDimensionalArr.length; col++) {
				twoDimensionalArr[row][col] = count; //use the two different loop variables row, col as the indexes to access each element of the array.
				count++;
//				System.out.println(Arrays.deepToString(twoDimensionalArr)); 
				// deepToString() converts multidimensional Arrays to strings and represents all their contents
			}
		}
		
		
		String[][] twoDimArr = new String[4][4];
		for(int r = 0; r < twoDimArr.length; r++) {
			for(int c = 0; c < twoDimArr.length; c++) {
				twoDimArr[r][c] = "[" + r + "," + c + "]";
				count++;
//				System.out.println(Arrays.deepToString(twoDimArr));
			}
		}
//		System.out.println(Arrays.deepToString(twoDimArr));
		
		int[][] data = new int[3][4];
		for(int r = 0; r < data.length; r++) {
			for(int c = 0; c < data.length; c++) {
				data[r][c] = r + c;
//				System.out.println(Arrays.deepToString(data));
			}
		}
		
		int[][] newArr = {
				{3, 4, 5, 6}, 
				{4, 5, 6, 7}, 
				{5, 6, 7, 8}
				
		};
		methodTwoDimArr(newArr);
//		System.out.println(Arrays.deepToString(newArr));
		
		int[][] arrData = new int[4][7];
		for(int r = 0; r < arrData[0].length; r++) { //this will count the columns meaning the second array
				arrData[2][r] = r + 1; //with this we fill the third row and upwards
	    }
//		System.out.println(Arrays.deepToString(arrData));
	}

}
		

