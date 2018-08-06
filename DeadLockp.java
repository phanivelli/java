package com.app;

public class DeadLockp {
	String st1=" Java";
	String st2=" Programming";
	
	Thread mts1=new Thread("My thread 1") {
		public void run() {
			while(true) {
				synchronized (st1) {
					synchronized (st2) {
						System.out.println(st1+st2);
					}
					
				}
			}
		}
	};
	Thread mts2=new Thread("My Thread2") {
		public void run() {
			while(true) {
				synchronized (st2) {
					synchronized (st1) {
						System.out.println(st1+st2);	
					}	
				}
			}
		}
	};
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeadLockp dlp=new DeadLockp();
		dlp.mts1.start();
		dlp.mts2.start();

	}

}
