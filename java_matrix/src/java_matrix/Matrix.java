package java_matrix;

import java.util.Scanner;

public class Matrix {
	
	static int[][] mat1 = new int[3][3];     //Create matrix 1
	static int[][] mat2 = new int[3][3];		//Create matrix 2
	static int[][] mat3 = new int[3][3];		//Create matrix 3
	
///Method Of thread class for 1st row Multiplication 
	
	static Thread row1 = new Thread(new Runnable() {
		public void run() {
			for (int j = 0; j < 3; j++) {
				for (int i = 0; i < 3; i++) {
					mat3[0][j] += mat1[0][i]*mat2[i][j];
				}
			}
		}
	});
	
/// Method Of thread class for 2nd row Multiplication 
	
	static Thread row2 = new Thread(new Runnable() {
		public void run() {
			for (int j = 0; j < 3; j++) {
				for (int i = 0; i < 3; i++) {
					mat3[1][j] += mat1[1][i]*mat2[i][j];
				}
			}
		}
	});
	
	/// Method Of thread class for 3rd row Multiplication 
	
	static Thread row3 = new Thread(new Runnable() {
		public void run() {
			for (int j = 0; j < 3; j++) {
				for (int i = 0; i < 3; i++) {
					mat3[2][j] += mat1[2][i]*mat2[i][j];
				}
			}
		}
	});
	
	//A method for starting The Threads 
	
    static void Do(){
    	row1.start();   
    	row2.start();	   
    	row3.start();    
    	}
    
    //Main function;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/// Taking 1st matrix
		System.out.println("Enter matrix 1 : ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				mat1[i][j] = input.nextInt();
			}
			
		}
		
		/// Taking 1st matrix
		
		System.out.println("Enter matrix 2 : ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				mat2[i][j] = input.nextInt();
			}
			
		}
		
		//calling a function to run the thread
		
		Matrix.Do();
		
		///Joining the thread
		
		try {
			row1.join();
			row2.join();
			row3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		///Output the required matrix
		
		System.out.println("The Required matrix is:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(mat3[i][j] + " ");
			}
			System.out.println("");
		}
	}

}