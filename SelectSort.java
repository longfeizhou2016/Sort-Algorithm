package com.sort;

import java.util.Arrays;

/**
 * 
 * @author zlf
 * 选择排序
 * 选择排序(Selection-sort)是一种简单直观的排序算法。
 * 它的工作原理：首先在未排序序列中找到最小（大）元素，
 * 存放到排序序列的起始位置，然后，再从剩余未排序元素中继续寻找最小（大）元素，
 * 然后放到已排序序列的末尾。以此类推，直到所有元素均排序完毕。 
 *
 */
public class SelectSort {

	public static int[] sort(int[] a){
		int len = a.length;
		for(int i =0; i<len; i++){
			int idx=i;
			for(int j=i+1; j<len; j++){
				if(a[j]<a[idx]) idx=j;
				System.out.print(j+",");
			}
			int tmp=a[i];
			a[i]=a[idx];
			a[idx]=tmp;	
			System.out.println(Arrays.toString(a));
		}
		return a;
	}
	
	public static void main(String[] args) {
		int[] arr={31,8,21,5,10,7,4,2};
		int[] arr2=sort(arr);
//		System.out.println(Arrays.toString(arr2));
	}
	
}
