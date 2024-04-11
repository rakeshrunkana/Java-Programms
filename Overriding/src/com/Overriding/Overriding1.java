package com.Overriding;

class TV {
	public void switchON() {
		System.out.println("TV is Switched On ");
	}

	public void changeChannel() {
		System.out.println("Tv Channel is Changes ");
	}
}

class SmarTV extends TV {
	@Override
	public void switchON() {
		System.out.println("smartTv is Switched ON ");
	}

	@Override
	public void changeChannel() {
		System.out.println("SmartTV Channel is Changed ");
	}

	public void Browse() {
		System.out.println("Smart Tv Browsing ");
	}
}

public class Overriding1 {

	public static void main(String[] args) {
		// TV t = new TV();
		// t.switchON();
		// t.changeChannel();
		SmarTV st = new SmarTV();
		st.switchON();
		st.Browse();
	}

}
