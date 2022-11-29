package com.kh.day05.array;

public class Exam_SortBubble {
	public static void main(String[] args) {
		// 정렬 알고리즘
		// 3. 버블정렬이란?
		// 인접한 두개의 원소를 검사하여 정렬하는 방법 
		// 구현이 쉽다는 장점이 있고, 이미 정렬된 데이터를 정렬할 때 가장 빠름
		// 기본적으로 다른 정렬에 비해 정렬 속도가 느리며
		// 역순으로 정렬할때 가장 느림
		
		// {2, 5, 4, 1, 3}     // 앞에 두개씩 비교!, 큰걸제일오른쪽으로
		// i=0일때 			   // 처음엔 배열크기-1 만큼, 점점 줄어듬
		// 2, 5, 4, 1, 3
		// 2, 4, 5, 1, 3
		// 2, 4, 1, 5, 3
		// 2, 4, 1, 3, 5
		
		// i=1일때
		// 2, 4, 1, 3, 5
		// 2, 1, 4, 3, 5
		// 2, 1, 3, 4, 5
		
		// i=2일때
		// 1, 2, 3, 4, 5
		// 1, 2, 3, 4, 5
		
		int[] arrs = {2, 5, 4, 1, 3};
		for (int i = 0; i < arrs.length-1; i++) {
			for(int j = 0; j < (arrs.length-1)-i; j++) {
				if(arrs[j] > arrs[j+1]) {
					int temp = arrs[j+1];
					arrs[j+1] = arrs[j];
					arrs[j] = temp;
				}
			}
		}
		for(int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
		
//		int i, j, temp;
//		int [] arr = {1, 9, 4, 6, 11, 10, 3, 15, 2, 13};
//		for (i = 0; i < 10; i++){
//			for(j = 0; j < 9 - i; j++) {
//				if(arr[j] > arr[j+1]){
//						temp = arr[j];
//						arr[j] = arr[j+1];
//						arr[j+1] = temp;
//				}
//			}
//		}
//		for (i = 0; i < 10; i++){
//			System.out.print(arr[i] + " ");
//		}
//		}
}}
