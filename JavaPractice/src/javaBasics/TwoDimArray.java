package javaBasics;

public class TwoDimArray {

	public static void main(String[] args) {

		String x[][]=new String[3][5];
		System.out.println(x.length); //3- Total no of rows
		System.out.println(x[0].length); //5- Total no of columns

		//1st row
		x[0][0]="A0";
		x[0][1]="B0";
		x[0][2]="C0";
		x[0][3]="D0";
		x[0][4]="E0";

		//2nd row
		x[1][0]="A1";
		x[1][1]="B1";
		x[1][2]="C1";
		x[1][3]="D1";
		x[1][4]="E1";

		//3rd row
		x[2][0]="A2";
		x[2][1]="B2";
		x[2][2]="C2";
		x[2][3]="D2";
		x[2][4]="E2";

		System.out.println(x[1][2]);
		System.out.println(x[2][2]);
		System.out.println(x[0][4]);

		//print all the values of 2D array:
		//row=0, col=0 to 4
		//row=1, col=0 to 4
		//row=2, col=0 to 4

		System.out.println("*******Printing all values of 2d array*****");
		for(int row=0;row<x.length;row++) { // outer loop for rows
			for(int col=0;col<x[0].length;col++) { // inner loop for columns
				System.out.print(" "+x[row][col]+" " );
			}			
			System.out.println();
		}
	}
}
