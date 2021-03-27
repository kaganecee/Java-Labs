import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindSequence {

	public static void main(String[] args) throws FileNotFoundException{
		int matrix[][] = readMatrix();
		printMatrix(matrix);
		boolean found = false;
search: for (int i=0; i< matrix.length; i++) {
			for (int j=0; j < matrix[i].length; j++) {
				if (search(0,matrix, i,j)){
					found = true;
					break search;
				}
			}
		}
			
		if (found) {
			System.out.println("A sequence is found");
		}
		printMatrix(matrix);

	}

	/**
	 * search(number,matrix(data),row,col) = number == matrix[row,col] && search(number+1,matrix,row+1,col) ||
	 *  																  search(number+1,matrix,row-1,col)
	 *  																  search(number+1,matrix,row,col+1)
	 *  																  search(number+1,matrix,row,col-1)
	 */
	private static boolean search (int number, int[][]matrix, int row, int col) {
		if (row<0 || row>9 || col<0 || col>9)
			return false;
		boolean found;
		if(number == 9)
			found= number==matrix[row] [col];
		else {
			found = (number == matrix[row][col]) &&
					(search(number + 1, matrix, row + 1, col) ||
							search(number + 1, matrix, row - 1, col) || search(number + 1, matrix, row, col + 1) ||
							search(number + 1, matrix, row, col - 1));

		}
		if (found)
			matrix[row][col] = 9 - matrix[row][col];
		return found;
	}

	private static int[][] readMatrix() throws FileNotFoundException{
		int[][] matrix = new int[10][10];
		File file = new File("lab5/matrix.txt"); // if you run from command line use  new File("matrix.txt") instead

		try (Scanner sc = new Scanner(file)){

			
			int i = 0;
			int j = 0;
			while (sc.hasNextLine()) {
				int number = sc.nextInt();
				matrix[i][j] = number;
				if (j == 9)
					i++;
				j = (j + 1) % 10;
				if (i == 10)
					break;
			}
		} catch (FileNotFoundException e) {
			throw e;
		}
		return matrix;
	}
	
	private static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
					System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}	
	}
}
