package com.example.domain;

public class Car {
	private int speed;

	@Override
	public String toString() {
		return "Car [speed=" + speed + "]";
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
