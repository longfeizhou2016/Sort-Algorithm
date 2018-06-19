package com.sort;

import java.util.Arrays;

/**
 * 
 * @author zlf
 * 希尔排序
 * 希尔排序也是一种插入排序，
 * 它是简单插入排序经过改进之后的一个更高效的版本，
 * 也称为缩小增量排序，同时该算法是冲破O(n2）的第一批算法之一。
 * 它与插入排序的不同之处在于，它会优先比较距离较远的元素。
 * 希尔排序又叫缩小增量排序。希尔排序是把记录按下表的一定增量分组，
 * 对每组使用直接插入排序算法排序；
 * 随着增量逐渐减少，每组包含的关键词越来越多，
 * 当增量减至1时，整个文件恰被分成一组，算法便终止。
 *
 */
public class ShellSort {
	public static int[] sort(int[] a){
		int len = a.length;
		if(len<=1) return a;
		int gap=len/2;
		while(gap>0){
			for(int i=gap; i<len; i++){
				int cur = a[i];
				int idx = i-gap;
				while(idx>=0 && a[idx]>cur){
					a[idx+gap] = a[idx];
					idx-=gap;
				}
				a[idx+gap]=cur;
			}		
			gap = gap/2;
		}
		return a;
	}
	public static int[] sort2(int[] a){
		int len = a.length;
		int gap = len/2;
		while(gap>0){
			
			for(int i=gap; i<len; i++)
			{
				int cur=a[i];
				int idx=i-gap;
				while(idx>=0 && a[idx]>cur){
					a[idx+gap]=a[idx];
					idx-=gap;
				}
				a[idx+gap]=cur; 
			}
			gap/=2;
		}	
		return a;
	}
	
	public static void main(String[] args) {
		int[] a={8,9,1,7,2,3,5,4,6,0};
		a=sort2(a);
		System.out.println(Arrays.toString(a));
		
	}
	

}
