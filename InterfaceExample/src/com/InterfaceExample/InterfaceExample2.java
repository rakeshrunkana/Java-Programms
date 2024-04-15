package com.InterfaceExample;

class Phone {
	public void call() {
		System.out.println("Phone call");
	}

	public void sms() {
		System.out.println("Phone sending SMS");
	}
}

interface Camera {
	void click();

	void camerarecord();
}

interface MusicPlayer {
	void play();

	void stop();
}

class SmartPhone extends Phone implements Camera, MusicPlayer {
	public void videoCall() {
		System.out.println("Smart Phone video calling ");
	}

	public void click() {
		System.out.println("Smart Phone Clicking Photo");
	}

	public void camerarecord() {
		System.out.println("Smart Phone recording video");
	}

	public void play() {
		System.out.println("Smart Phone playing music");
	}

	public void stop() {
		System.out.println("Smart Phone stopped playing music ");
	}
}

public class InterfaceExample2 {

	public static void main(String[] args) {
		MusicPlayer sp = new SmartPhone();
		sp.play();
		sp.stop();
	}

}
