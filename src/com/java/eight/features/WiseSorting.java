package com.java.eight.features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class WiseSorting {

	public static void main(String[] args) {
		new WiseSorting().addElementInArray();
	}
	
	private void addElementInArray(){
		
		List<Integer> list = new ArrayList<>();
		Random random = new Random();
		System.out.println("Number of Elements\t\tNormal Sort\t\tParallel Sort");
		
		for(int i = 0; i < 10000000; i++ ){
			list.add(random.nextInt());
			
			if(i == 100 || i == 1000 || i == 10000 || i == 100000 || i == 1000000 || i == 10000000) {
				int[] array = toIntArray(list);
				long start = System.currentTimeMillis();
				Arrays.sort(array);
				System.out.print("\n"+i+"\t\t\t\t"+(System.currentTimeMillis() - start));
				
				long pStart = System.currentTimeMillis();
				Arrays.parallelSort(array);
				System.out.print("\t\t\t"+(System.currentTimeMillis() - pStart));
				
				i*=1;
			}
		}
	}
	
	private int[] toIntArray(List<Integer> list) {
		int[] result = new int[list.size()];
		for (int i = 0; i < result.length; i++)
			result[i] = list.get(i);
		return result;
	}
}
