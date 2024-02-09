package com.programs;

//Even and Odd in an array
public class Lab6 {

	public static void main(String[] args) {

		int a[] = { 5, 2, 7, 9, 6 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)
				System.out.println(a[i]);
		}
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0)
				System.out.println(a[i]);
		}

	}

}
