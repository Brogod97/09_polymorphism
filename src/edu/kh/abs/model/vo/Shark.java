package edu.kh.abs.model.vo;

public class Shark extends TypePisces {

	@Override
	public void swimming() {
		System.out.println("상어가 헤엄친다.");
	}

	@Override
	public void eat() {
		System.out.println("상어가 물고기를 잡아 먹는다.");
	}

	@Override
	public void cry() {
		System.out.println("상어가 표효한다.");
	}

	@Override
	public void move() {
		System.out.println("상어가 움직인.");
	}

}
