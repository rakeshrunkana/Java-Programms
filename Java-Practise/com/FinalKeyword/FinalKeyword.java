package com.FinalKeyword;

public class FinalKeyword {
    final int speedlimit=90; //Final variable cannot be changed
    void run() {
    	//speedlimit=400;
    }
	public static void main(String[] args) {
    FinalKeyword obj=new FinalKeyword();
    obj.run();
	}

}
