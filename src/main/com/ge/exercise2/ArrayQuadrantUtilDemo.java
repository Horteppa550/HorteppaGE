package com.ge.exercise2;

import java.util.Scanner;

public class ArrayQuadrantUtilDemo {

	public static void main(String[] args) {
		 char[][] data1 = {
	                {'a', 'b', 'c', 'd'},
	                {'e', 'f', 'g', 'h'},
	                {'i', 'j', 'k', 'l'},
	                {'m', 'n', 'o', 'p'}
	        };
		 System.out.println("Enter N X N matrix Size");
		 int n = new Scanner(System.in).nextInt();
		 	int count=65;
			char[][] data = new char [n][n];
			for(int i =0;i<data.length;i++) {
				for(int j =0;j<data[i].length;j++)
					data[i][j]=(char) count++;
			}

		ArrayQuadrantUtil util = new ArrayQuadrantUtil(data);
		System.out.println(util.getQuadrantValues(0, 2));
		System.out.println(util.getRowValues(1));
		System.out.println(util.getColumnValues(4));
	}
	
	

}
