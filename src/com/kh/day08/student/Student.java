package com.kh.day08.student;

public class Student {
	private String name;
	private int firstScore;
	private int secondScore;

	public Student() {
	}

	public Student(String name) {
		this.name = name;
	}

	public Student(int firstScore, int secondScore) {
		this.firstScore = firstScore;
		this.secondScore = secondScore;
	}

	public Student(String name, int firstScore, int secondScroe) {
		this.name = name;
		this.firstScore = firstScore;
		this.secondScore = secondScore;
	}

	// getter �޼ҵ�
	public String getName() {
		return this.name;
	}

	public int getFirstScore() {
		return this.firstScore;
	}

	public int getSecondScore() {
		return this.secondScore;
	}

	// setter �޼ҵ�
	public void setName(String name) {
		this.name = name;
	}

	public void serFirstSCore(int firstScore) {
		this.firstScore = firstScore;
	}

	public void setSecondScore(int secondScore) {
		this.secondScore = secondScore;
	}

}