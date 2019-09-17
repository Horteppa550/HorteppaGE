package com.ge.exercise2;

import org.junit.Assume;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ArrayQuadrantUtilTest {

	 char[][] data = {
             {'a', 'b', 'c', 'd'},
             {'e', 'f', 'g', 'h'},
             {'i', 'j', 'k', 'l'},
             {'m', 'n', 'o', 'p'}
     };
	
    @Test
    public void getQuadrantValuesTest() {
        ArrayQuadrantUtil util = new ArrayQuadrantUtil(data);
        Assume.assumeNotNull(util.getQuadrantValues(0, 0));
    }
    
    //Operation #1
    @Test
	public void Operation1RowTest() {
		 ArrayQuadrantUtil util = new ArrayQuadrantUtil(data);
		 char[] ch = {'e','f','g','h'};
		 assertArrayEquals(ch,util.getRowValues(1));
	}
    
    //Operation #2
    @Test
	public void Operation2ColumnTest() {
		 ArrayQuadrantUtil util = new ArrayQuadrantUtil(data);
		 char[] ch = {'b','f','j','n'};
		 assertArrayEquals(ch,util.getColumnValues(1));
	}
    
    //Operation #3
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
    
    @Test(expected=IllegalArgumentException.class)
    public void getQuadrantValuesNullTest() {
    	  ArrayQuadrantUtil util = new ArrayQuadrantUtil(data);
    	  //3 X 3 Not feasible in 4 X 4 So throwing IllegalArgumentException
    	  util.getQuadrantValues(3, 3);
    	  
    	 
    }
}