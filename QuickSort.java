package com.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * 
 * @author zlf
 * 快速排序
 * 基本思想是：通过一趟排序将要排序的数据分割成独立的两部分，
 * 其中一部分的所有数据都比另外一部分的所有数据都要小，
 * 然后再按此方法对这两部分数据分别进行快速排序，
 * 整个排序过程可以递归进行，以此达到整个数据变成有序序列。
 *
 */



public class QuickSort {
	
	public static int[] sort(int[] a,int low,int hight){
		if(low>=hight) return a;
		int i = low;
		int j = hight;
		int key = a[low];
		while(i<j){
			while(i<j && a[j]>=key){
				j--;
			}
			a[i]=a[j];
			while(i<j && a[i]<=key){
				i++;
			}
			a[j]=a[i];
		}
		a[i]=key;
		sort(a, low, i-1);
		sort(a, j+1, hight);
		return a;
	}

	public static void main(String[] args) {
		int[] a =new int[10];
		Random r1=new Random();
		for(int i=0; i<10;i++){
			a[i]=r1.nextInt(10);
		}
		
		System.out.println("初始数组："+Arrays.toString(a));
		
		int[] b=sort(a,0,a.length-1);
		System.out.println(Arrays.toString(b));

	}
	
	
	
	
}
