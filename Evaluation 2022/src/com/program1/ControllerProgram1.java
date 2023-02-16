package com.program1;

public class ControllerProgram1 {

	public static void main(String[] args) {

		Prime t1 = new Prime();
		Palindrome t2 = new Palindrome();

		t1.start();
		t1.setName("Thread 1");

		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		t2.start();
		t2.setName("Thread 2");
	}
}
