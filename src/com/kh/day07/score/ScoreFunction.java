package com.kh.day07.score;

import java.util.Scanner;

public class ScoreFunction {
	// scoreFunction�� ���������
	private int kor;
	private int eng;
	private int math;

	public int printMenu() { // return���� �ڷ��� �־������
		Scanner sc = new Scanner(System.in);
		System.out.println("===== ���� �޴� =====");
		System.out.println("1. �����Է�");
		System.out.println("2. �������");
		System.out.println("3. ����");
		System.out.print("���� : ");
		int choice = sc.nextInt();
		return choice;
	}

	public void inputScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== ���� �Է� =====");
		System.out.print("���� : ");
		kor = sc.nextInt();
		System.out.print("���� : ");
		eng = sc.nextInt();
		System.out.print("���� : ");
		math = sc.nextInt();

	}

	public void printScore() {
		System.out.println("===== ���� ��� =====");
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + math);
//		System.out.println("���� : " + sum);
//		System.out.printf("��� : %.2f \n", avg);
	}

	public void goodByeMsg() {
		System.out.println("Good Bye~~");
	}

	public void exceptionMsg() {
		System.out.println("1 ~ 3������ ���ڸ� �Է����ּ���.");
	}

}