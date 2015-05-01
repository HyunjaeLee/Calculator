package com.hyunjae.calculator;

import java.util.ArrayList;
import java.util.Arrays;

public class Split {
	public static ArrayList<String> expression(String expression){
		expression.trim();
		String[] expressionArray=expression.split
				("((?<=\\+)|(?=\\+))|((?<=-)|(?=-))|((?<=\\*)|(?=\\*))|((?<=/)|(?=/))");
		ArrayList<String> expressionList=new ArrayList<String>(Arrays.asList(expressionArray));
		if(expressionList.get(0)!="-"||expressionList.get(0)!="+")
			expressionList.add(0, "+");
		return expressionList;
	}
}
