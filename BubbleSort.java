package com.sort;

import java.util.Arrays;

/**
 * 
 * @author zlf
 * 冒泡排序
 *冒泡排序是一种简单的排序算法。
 *它重复地走访过要排序的数列，
 *一次比较两个元素，如果它们的顺序错误就把它们交换过来。
 *走访数列的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成。
 *这个算法的名字由来是因为越小的元素会经由交换慢慢“浮”到数列的顶端。 
 *
 *
 */
public class BubbleSort {

	public static int[] sort(int[] arr){
		int len = arr.length;
		for(int i = 0; i< len ; i++){
			for(int j = 0 ; j < len-i-1 ; j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}		
			}	
			System.out.println(Arrays.toString(arr));
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr={31,8,21,5,10,7,4,2};
		int[] arr2=sort(arr);
//		System.out.println(Arrays.toString(arr2));
	}
}
