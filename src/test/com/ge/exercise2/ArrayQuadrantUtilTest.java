package com.ge.exercise2;

import org.junit.Assume;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArrayQuadrantUtilTest {

    @Test
    public void getQuadrantValuesTest() {
        char[][] data = {
                {'a', 'b', 'c', 'd'},
                {'e', 'f', 'g', 'h'},
                {'i', 'j', 'k', 'l'},
                {'m', 'n', 'o', 'p'}
        };

        ArrayQuadrantUtil util = new ArrayQuadrantUtil(data);
        Assume.assumeNotNull(util.getQuadrantValues(0, 0));

        char[] expectedResult = {'a', 'b', 'e', 'f'};
        assertArrayEquals(expectedResult, util.getQuadrantValues(0, 0));
        
        char[] expectedResult1 = {'k', 'l', 'o', 'p'};
        assertArrayEquals(expectedResult1, util.getQuadrantValues(1, 1));
        
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void getQuadrantValuesNullTest() {
    	  char[][] data = {
                  {'a', 'b', 'c', 'd'},
                  {'e', 'f', 'g', 'h'},
                  {'i', 'j', 'k', 'l'},
                  {'m', 'n', 'o', 'p'}
          };
    	  ArrayQuadrantUtil util = new ArrayQuadrantUtil(data);
    	  util.getQuadrantValues(3, 3);
    	  
    	 
    }
    @Test
    public void getQuadrantValuesNTest()
    {
    	 int count=65;
			char[][] data1 = new char [9][9];
			for(int i =0;i<data1.length;i++) {
				for(int j =0;j<data1[i].length;j++)
					data1[i][j]=(char) count++;
			}
			ArrayQuadrantUtil util = new ArrayQuadrantUtil(data1);
			char[] expectedResult1 = {'G', 'H', 'I', 'P','Q','R','Y','Z','['};
	        assertArrayEquals(expectedResult1, util.getQuadrantValues(0, 2));
 	  //GHIPQRYZ[
    }
    
    @Test
	public void Operation1RowTest() {
		 char[][] data1 = {
	                {'a', 'b', 'c', 'd'},
	                {'e', 'f', 'g', 'h'},
	                {'i', 'j', 'k', 'l'},
	                {'m', 'n', 'o', 'p'}
	        };
		 
		 ArrayQuadrantUtil util = new ArrayQuadrantUtil(data1);
		 char[] ch = {'e','f','g','h'};
		 assertArrayEquals(ch,util.getRowValues(1));
		 
	}
    
    @Test
	public void Operation2ColumnTest() {
		 char[][] data1 = {
	                {'a', 'b', 'c', 'd'},
	                {'e', 'f', 'g', 'h'},
	                {'i', 'j', 'k', 'l'},
	                {'m', 'n', 'o', 'p'}
	        };
		 
		 ArrayQuadrantUtil util = new ArrayQuadrantUtil(data1);
		 char[] ch = {'b','f','j','n'};
		 assertArrayEquals(ch,util.getColumnValues(1));
		 
	}
}