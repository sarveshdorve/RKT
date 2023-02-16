package com.program1;

import java.util.*;

public class Palindrome extends Thread {
	Vector<Integer> pl = new Vector<Integer>();
	int Start = 10;
	int End = 1000;
	int len = 0;
	int tem = 0;
	@Override
	public synchronized void run() {
		String str = Thread.currentThread().getName();
		int temp;

		for (int i = Start; i < End; i++) {
			temp = i;
			int res = 0;
			while (temp > 0) {
				int rem = temp % 10;
				res = res * 10 + rem;
				temp = temp / 10;
			}
			if (res == i) {
				System.out.println(i + " is a palindrome number " + str);
			}
		}
	}

	public boolean ispalindrome(int num) {
		int temp;
		for (int i = Start; i < End; i++) {
			temp = i;
			int res = 0;
			while (temp > 0) {
				int rem = temp % 10;
				res = res * 10 + rem;
				temp = temp / 10;
			}
			if (res == i) {
				pl.add(res);
				tem = pl.size();
			}
		}
		if (pl.contains(num)) {
			return true;
		}
		return false;
	}

	public boolean len(int x) {
		len=tem;
		boolean y = true;
		System.out.println(x);
		if(len==x) {
			y = false;
		}
		if(y!=true) {
			return false;
		}
		return y;
	}
}
