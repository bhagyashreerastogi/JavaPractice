package javaBasics;

public class ArrayConcept {

	public static void main(String[] args) {

		//Array: to store similar data types values in a array variable
		//one dimentional array

		//Disadvantages of array
		//1. Size is fixed = static array --> To overcome of this problem -- We use collections -> ArrayList, HashTable -- dynamic array
		//2. It stores only similar data types --> To overcome of this problem -- We can use Object Array

		//int array
		//lowest bound/index=0
		//upper bound/index=n-1(n is size of array)
		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		System.out.println(i[2]);
		System.out.println(i[3]);
		//System.out.println(i[4]);//ArrayIndexOutOfBoundsException

		System.out.println("Length of int array "+i.length); //.length will give you size/length of array

		//print all the values of array: use for loop
		for(int j=0;j<i.length;j++){
			System.out.println(i[j]);
		}

		//2. double array
		double d[]=new double[3];
		d[0]=12.34;
		d[1]=34.90;
		d[2]=45.77;
		System.out.println(d[2]);

		//3. char array
		char c[]=new char[3];
		c[0]='a';
		c[1]='e';
		c[2]='$';
		System.out.println(c[1] +" & "+ c[2] );

		//4. boolean array
		boolean b[]=new boolean[2];
		b[0]=true;
		b[1]=false;
		System.out.println(b[1]);

		//5. String array
		String s[]=new String[3];
		s[0]="Hi test";
		s[1]="Testing";
		s[2]="Selenium";
		System.out.println(s[2]);
		System.out.println("Length of string array = "+s.length);

		//6. Object Array
		//Object is the super most class in Java.
		//Object Array is used to store different data type values

		System.out.println("-------- Object Array -------");
		Object ob[]=new Object[6];
		ob[0]="Tom";
		ob[1]=12;
		ob[2]=12.45;
		ob[3]="1/1/1991";
		ob[4]="M";
		ob[5]="London";
		System.out.println(ob[3]);
		System.out.println("Length of object array = "+ob.length);

	}
}