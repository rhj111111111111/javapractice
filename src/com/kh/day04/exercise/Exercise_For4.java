package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_For4 {

	public static void main(String[] args) {
		// ������ �ϳ� �Է¹޾Ƽ� �� ���� 1 ~ 9 ������ ���϶���
		// �� ���� �������� ����ϼ���
		// ��, ������ ���� ������ "1 ~ 9������ ����� �Է��Ͽ��� �մϴ�"�� ����ϼ���

		Scanner sc = new Scanner(System.in);

//		int num; -> �������� ����
		System.out.print("1 ~ 9 ������ ���� �ϳ� �Է� : "); // 1 < dan < 9
		int dan = sc.nextInt();

		if ((dan >= 1) && (dan <= 9)) {
			for (int i = 1; i < 10; i++) {
//              num = 0; -> �������� ����
				System.out.println(dan + " * " + i + " = " + dan * i);
			}
		} else {
			System.out.println("1 ~ 9������ ����� �Է��Ͽ��� �մϴ�.");
		}
//		System.out.printlnt(num);
	}
}
// for���� if���� ���� ���� Ȱ��
