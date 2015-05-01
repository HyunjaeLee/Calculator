package com.hyunjae.calculator;

import java.util.ArrayList;
import java.util.Arrays;

public class Parse {
	public static int[] expression(ArrayList<String> expressionList, int index, String deliminator){
		String[] expressionArray=new String[expressionList.size()];
		expressionArray=expressionList.toArray(expressionArray);
		int[] indexArray=new int[3];
		int defaultIndex=Arrays.binarySearch(expressionArray, index, expressionArray.length, deliminator);
		if(defaultIndex<0)
			return null;
		if(defaultIndex==0)
			return expression(expressionList,++index,deliminator);
		if(expressionArray[defaultIndex-2]=="+"||expressionArray[defaultIndex-2]=="-")
			indexArray[0]=defaultIndex-2;
		else
			indexArray[0]=defaultIndex-1;
		if(expressionArray[defaultIndex+1]=="+"||expressionArray[defaultIndex+1]=="-")
			indexArray[1]=defaultIndex+2;
		else
			indexArray[1]=defaultIndex+1;
		indexArray[2]=defaultIndex;
		return indexArray;
	}
}
