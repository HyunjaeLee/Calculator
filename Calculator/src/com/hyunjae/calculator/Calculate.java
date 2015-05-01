package com.hyunjae.calculator;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Calculate {
	public static BigDecimal expression(String expression){
		return expression(Split.expression(expression));
	}
	
	public static BigDecimal expression(ArrayList<String> expressionList){
		int firstIndex=0;
		int lastIndex=0;
		int defaultIndex=0;
		BigDecimal[] value=null;
		BigDecimal total=null;
		for(int tempIndex=0;tempIndex<expressionList.size();tempIndex=lastIndex){
			int[] additionIndex=Parse.expression(expressionList,tempIndex,"+");
			if(additionIndex==null)
				break;
			firstIndex=additionIndex[0];
			lastIndex=additionIndex[1];
			defaultIndex=additionIndex[2];
			value=Build.expression(expressionList, firstIndex, lastIndex, defaultIndex);
			total=value[0].add(value[1]);
			Amend.set(expressionList, firstIndex, lastIndex, total.toString());
		}
		return null; //temp return
	}
}
