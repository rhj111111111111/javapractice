package com.kh.day07.oop;

class Sample{
	
	public int a;
//	private int b;
	int c;
}

public class Exam_Access {

	public static void main(String[] args) {
		Sample aClass = new Sample();
		aClass.a = 10; // ���ٰ���
//		aClass.b = 10; // ���ٺҰ��� is not, visible
		aClass.c = 10; // ���ٰ���
	}

}