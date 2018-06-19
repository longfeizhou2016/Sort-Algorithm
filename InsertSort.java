package com.sort;

import java.util.Arrays;

/**
 * 
 * @author zlf
 *  ��������
 *  ����ԭ����ͨ�������������У�����δ�������ݣ�
 *  �������������дӺ���ǰɨ�裬�ҵ���Ӧλ�ò����롣
 *  ����������ʵ���ϣ�ͨ������in-place����
 *  ����ֻ���õ�O(1)�Ķ���ռ�����򣩣�����ڴӺ���ǰɨ������У�
 *  ��Ҫ������������Ԫ�������Ųλ��Ϊ����Ԫ���ṩ����ռ䡣
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
