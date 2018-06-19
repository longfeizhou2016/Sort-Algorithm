package com.sort;

import java.util.Arrays;

/**
 * 
 * @author zlf
 *  插入排序
 *  工作原理是通过构建有序序列，对于未排序数据，
 *  在已排序序列中从后向前扫描，找到相应位置并插入。
 *  插入排序在实现上，通常采用in-place排序
 *  （即只需用到O(1)的额外空间的排序），因而在从后向前扫描过程中，
 *  需要反复把已排序元素逐步向后挪位，为最新元素提供插入空间。
 *  
 */
public class InsertSort {

	public static int[] sort(int[] a){
		int len =a.length;
		for(int i=0 ; i<len-1; i++){
			int current = a[i+1];
			int idx=i;
			while( idx>=0 &&a[idx]>current){
				a[idx+1] = a[idx];
				idx--;
			}
			a[idx+1]=current;
			System.out.println(Arrays.toString(a));
		}
		
		return a;
	}
	public static void main(String[] args) {
		int[] arr={31,8,21,5,10,7,4,2};
		int[] arr2=sort2(arr);
//		System.out.println(Arrays.toString(arr2));
	}
	
	public static int[] sort2(int[] a){
		int len = a.length;
		for(int i=0;i<len-1;i++){
			int cur = a[i+1];
			int idx = i;
			while(idx>=0 && a[idx]>cur){
				a[idx+1]=a[idx];
				idx--;
			}
			a[idx+1]=cur;
			System.out.println(Arrays.toString(a));
		}
		
		return a;
	}
	
	
	
	
}
