package com.kh.day10.zoointerface;

public class ZooKeeper {
	public void feed() {
		System.out.println("feed meat");
	}
	
	public void feed(Predator predator) {
		System.out.println("feed " + predator.animalFood());
	}
	
	
//	public void feed(Tiger tiger) {
//		System.out.println("Ư���� �ݴϴ�.");
//	}
//	public void feed(Lion lion) {
//		System.out.println("�������⸦ �ݴϴ�.");
//	}
//	public void feed(Bear bear) {
//		System.out.println("��� �ݴϴ�.");
//	}
}