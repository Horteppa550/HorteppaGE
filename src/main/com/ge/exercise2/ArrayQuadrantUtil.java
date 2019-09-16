package com.ge.exercise2;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayQuadrantUtil {
    private static final Logger logger = LogManager.getLogger(ArrayQuadrantUtil.class);

    char[][] data;
    
    List<Integer> numberOfQuadrantList = new ArrayList<>();

    public ArrayQuadrantUtil(char[][] data) {
        //Assuming matrix size is N X N only
    	this.data = data;
    }

    //Operation #3 for quadrant (x,y)
    public char[] getQuadrantValues(int x, int y) {
    	char[] ch = null;
    	int count=0;
    	int length = data.length;
    	for(int i=2;i<=length/2;i++) {
    		if(length%i==0) numberOfQuadrantList.add(i);
    	}
    	for(int qSize:numberOfQuadrantList) {
    		ch = new char[qSize*qSize];
    		System.out.println("=========== "+qSize+" X "+qSize+" ==================");
    		count=0;
    		if(x>=length/qSize || y>=length/qSize) {throw new IllegalArgumentException("quadrant Limit acceeds ("+x+" , "+y+") for "+qSize+" X "+qSize+" Martix");}
    		for(int i=(x*qSize);i<(x*qSize)+qSize;i++) {
    			for(int j=(y*qSize);j<(y*qSize)+qSize;j++) {
    				System.out.print(" "+data[i][j]);
    				ch[count++] = data[i][j];
    			}
    			System.out.println();
    		}
    	}
        return ch;
    }
    
    //Operation #2 for column
    public char[] getColumnValues(int column) {
    	char[] ch = new char[data.length];
    	for(int i=0;i<data.length;i++) {
    		ch[i] = data[i][column];
    	}
        return ch;
    }
    
    //Operation #1 for row 
    public char[] getRowValues(int row) {
    	
    	
    	return data[row];
    }
}
