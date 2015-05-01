package com.hyunjae.calculator;

import java.util.ArrayList;
import java.util.Arrays;

public class Amend{
	public static <T> ArrayList<T> set(ArrayList<T> list, int firstIndex, int lastIndex, T value){
		for(int counter=firstIndex;counter<=lastIndex;counter++){
			list.remove(firstIndex);
		}
		list.addAll(firstIndex,new ArrayList<T>(Arrays.asList(value)));
		return list;
	}
}
