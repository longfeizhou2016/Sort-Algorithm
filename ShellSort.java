package com.sort;

import java.util.Arrays;

/**
 * 
 * @author zlf
 * ϣ������
 * ϣ������Ҳ��һ�ֲ�������
 * ���Ǽ򵥲������򾭹��Ľ�֮���һ������Ч�İ汾��
 * Ҳ��Ϊ��С��������ͬʱ���㷨�ǳ���O(n2���ĵ�һ���㷨֮һ��
 * �����������Ĳ�֮ͬ�����ڣ��������ȱȽϾ����Զ��Ԫ�ء�
 * ϣ�������ֽ���С��������ϣ�������ǰѼ�¼���±��һ���������飬
 * ��ÿ��ʹ��ֱ�Ӳ��������㷨����
 * ���������𽥼��٣�ÿ������Ĺؼ���Խ��Խ�࣬
 * ����������1ʱ�������ļ�ǡ���ֳ�һ�飬�㷨����ֹ��
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
