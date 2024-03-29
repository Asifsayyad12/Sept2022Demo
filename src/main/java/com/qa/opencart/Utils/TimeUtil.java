package com.qa.opencart.Utils;

public class TimeUtil {

	public final static int DEFAULT_TIME_OUT=10;
	public final static long SMALL_TIME_OUT=1000;
	public final static long MEDIUM_TIME_OUT=5000;
	public final static long LARGE_TIME_OUT=10000;
	public final static long EXTRALARGE_TIME_OUT=20000;
	
	
	public static void smallWait() {
	try {
		Thread.sleep(SMALL_TIME_OUT);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	}
	
	public static void mediumWait() {
		try {
			Thread.sleep(MEDIUM_TIME_OUT);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void largeWait() {
		try {
			Thread.sleep(LARGE_TIME_OUT);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void superLongWait() {
		try {
			Thread.sleep(EXTRALARGE_TIME_OUT);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void applywait(int time) {
		try {
			Thread.sleep(time*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	

}
