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
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter N X N matrix Size");
		 int n =sc.nextInt();
		 
		 System.out.println("Enter Quadrant co-ordinates(x,y)");
		 int x = sc.nextInt();
		 int y = sc.nextInt();
		 int count=65;
		 char[][] data = new char [n][n];
		 for(int i =0;i<data.length;i++) {
			for(int j =0;j<data[i].length;j++)
					data[i][j]=(char) count++;
			}

		ArrayQuadrantUtil util = new ArrayQuadrantUtil(data);
		System.out.print("Quadrant value of (x,y)\n");
		System.out.println(util.getQuadrantValues(x, y));
		System.out.print("1st Row ");
		System.out.println(util.getRowValues(1));
		System.out.print("2nd Column ");
		System.out.println(util.getColumnValues(2));
	}
	
	

}
