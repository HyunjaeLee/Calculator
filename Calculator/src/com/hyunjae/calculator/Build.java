package com.hyunjae.calculator;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Build {
	public static BigDecimal[] expression(ArrayList<String> expressionList,int firstIndex,int lastIndex,int defaultIndex){
		return expression(expressionList.toArray(new String[0]),firstIndex,lastIndex,defaultIndex);
	}
	
	public static BigDecimal[] expression(String[] expressionArray,int firstIndex,int lastIndex,int defaultIndex){
		StringBuilder value1=new StringBuilder("");
		StringBuilder value2=new StringBuilder("");
		BigDecimal total1=new BigDecimal("0");
		BigDecimal total2=new BigDecimal("0");
		for(int tempIndex=firstIndex;tempIndex<defaultIndex;tempIndex++){
			value1.append(expressionArray[tempIndex]);
		}
		for(int tempIndex=++defaultIndex;tempIndex<=lastIndex;tempIndex++){
			value2.append(expressionArray[tempIndex]);
		}
		total1=total1.add(new BigDecimal(value1.toString()));
		total2=total2.add(new BigDecimal(value2.toString()));
		return new BigDecimal[]{total1,total2};
	}
}
