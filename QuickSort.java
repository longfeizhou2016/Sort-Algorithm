package com.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * 
 * @author zlf
 * ��������
 * ����˼���ǣ�ͨ��һ������Ҫ��������ݷָ�ɶ����������֣�
 * ����һ���ֵ��������ݶ�������һ���ֵ��������ݶ�ҪС��
 * Ȼ���ٰ��˷����������������ݷֱ���п�������
 * ����������̿��Եݹ���У��Դ˴ﵽ�������ݱ���������С�
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
		
		System.out.println("��ʼ���飺"+Arrays.toString(a));
		
		int[] b=sort(a,0,a.length-1);
		System.out.println(Arrays.toString(b));

	}
	
	
	
	
}
