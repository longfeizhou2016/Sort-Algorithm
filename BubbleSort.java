package com.sort;

import java.util.Arrays;

/**
 * 
 * @author zlf
 * ð������
 *ð��������һ�ּ򵥵������㷨��
 *���ظ����߷ù�Ҫ��������У�
 *һ�αȽ�����Ԫ�أ�������ǵ�˳�����Ͱ����ǽ���������
 *�߷����еĹ������ظ��ؽ���ֱ��û������Ҫ������Ҳ����˵�������Ѿ�������ɡ�
 *����㷨��������������ΪԽС��Ԫ�ػᾭ�ɽ������������������еĶ��ˡ� 
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
