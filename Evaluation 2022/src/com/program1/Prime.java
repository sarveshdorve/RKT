package com.program1;

import java.util.Vector;

public class Prime extends Thread {
	Vector<Integer> prL = new Vector<Integer>();
	int Start = 2;
	int End = 100;

	@Override
	public synchronized void run() {
		String str = Thread.currentThread().getName();
		for (int j = Start; j < End; j++) {
			int flag = 0;
			for (int i = 2; i < j; i++) {
				if (j % i == 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(j + " is Prime " + str);
			}
		}
	}

	boolean isPrime(int n) {
		int i, m = 0, flag = 0;
		m = n / 2;
		if (n == 0 || n == 1) {
			// System.out.println("Enter other than 0 and 1 (Zero and one) ");
			return false;
		} else {
			for (i = 2; i <= m; i++) {
				if (n % i == 0) {
					// System.out.println(n);
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				// System.out.println(n);
				return true;
			}
		} // end of else
		return false;
	}
}
