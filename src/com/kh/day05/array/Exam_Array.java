package com.kh.day05.array;

public class Exam_Array {

	public static void main(String[] args) {
		int num;
		// ����, �Ҵ�, �ʱ�ȭ
		int [] nums = new int[10]; 
		System.out.println(nums[0]); 
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		System.out.println(nums[0]); 
		System.out.println("ù��° �� : " + nums[0]); 
		System.out.println("�ι�° �� : " + nums[1]);
		System.out.println("����° �� : " + nums[2]);
		System.out.println("�迭�� ũ�� : " + nums.length);
		
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
		}
		
		System.out.println();
		
		for(int i=0; i<nums.length; i++) {
			nums[i] = 100;
			System.out.print(nums[i]);
		}
		
		
	}

}