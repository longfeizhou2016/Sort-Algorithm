package com.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * 
 * @author zlf
 * �鲢����
 * ���㷨�ǲ��÷��η���Divide and Conquer����һ���ǳ����͵�Ӧ�á�
 * �鲢������һ���ȶ������򷽷���
 * ��������������кϲ����õ���ȫ��������У�
 * ����ʹÿ��������������ʹ�����жμ�����
 * �������������ϲ���һ���������Ϊ2-·�鲢
 *
 */
public class MergeSort {
	public static int[] sort(int[] a){
		int len = a.length;
		if(len<2) return a;
		int mid = len/2;
		int[] left_a=Arrays.copyOfRange(a, 0, mid);  //�õ��������
		int[] right_a=Arrays.copyOfRange(a, mid, len); //�õ��ұ�����
		int[] left=sort(left_a);
		int[] right=sort(right_a);
		int[] b = merge(left,right);
//		System.out.println(Arrays.toString(b));
		return b;
	}
	public static int[] merge(int[] left,int[] right){
		int len_left=left.length;
		int len_right=right.length;
		int len_c=len_left+len_right;
		int[] c=new int[len_c];
		for(int idx=0,i=0,j=0; idx<len_c; idx++){
			if(i>=len_left)  //�����ߵ�ͷ ��ֱ�ӷ��ұ�Ԫ��
				c[idx]=right[j++];
			else if(j>=len_right)  //����ұߵ�ͷ ��ֱ�ӷ����Ԫ��
				c[idx]=left[i++];
			else if(left[i]>right[j]) //����ұ�С�����  ����ұ�Ԫ��
				c[idx]=right[j++];
			else 
				c[idx]=left[i++];
		}
		return c;
	}
	
	public static int[] sort2(int[] a){
		int len_a = a.length;
		if(len_a<2) return a;
		int[] left_a=Arrays.copyOfRange(a, 0,len_a/2);
		int[] right_a=Arrays.copyOfRange(a,len_a/2,len_a);
		int[] left=sort2(left_a);
		int[] right=sort2(right_a);
		int[] result = merge2(left, right);
		return result;	
	}
	public static int[] merge2(int[] left,int[] right){
		int len_left =left.length;
		int len_right =right.length;
		int len_result = len_left+len_right;
		int[] result = new int[len_result];
		for(int idx=0,i=0,j=0;idx<len_result;idx++){
			if(i>=len_left)
				result[idx]=right[j++];
			else if(j>=len_right)
				result[idx]=left[i++];
			else if(left[i]>right[j])
				result[idx]=right[j++];
			else
				result[idx]=left[i++];
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		int[] a =new int[10];
		Random r1=new Random();
		for(int i=0; i<10;i++){
			a[i]=r1.nextInt(10);
		}
		System.out.println("��ʼ���飺"+Arrays.toString(a));
		
		a=sort2(a);
		System.out.println(Arrays.toString(a));
//		int[] c=merge(new int[]{1,6,9,10},new int[]{2,4,7});
//		System.out.println(Arrays.toString(c));
	}
	

}
