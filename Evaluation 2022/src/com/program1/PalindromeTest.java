package com.program1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PalindromeTest {
	Palindrome palindrome = new Palindrome();
	int start = palindrome.Start;
	int end = palindrome.End;
	int length = palindrome.len;

	@Test
	void testRun() {
		assertEquals(palindrome.ispalindrome(101), true);
		assertEquals(palindrome.ispalindrome(565), true);
		assertEquals(palindrome.ispalindrome(474), true);
		assertEquals(palindrome.ispalindrome(585), true);
		assertEquals(palindrome.ispalindrome(111), true);
		assertEquals(palindrome.ispalindrome(141), true);
		assertEquals(palindrome.ispalindrome(222), true);
		assertEquals(palindrome.ispalindrome(656), true);
		assertEquals(palindrome.ispalindrome(989), true);
		assertEquals(palindrome.ispalindrome(999), true);
		System.out.println("\nTested ...... Multiple test cases using assertEquals funtn without @Parameterized Test anotation\n");
	}

	@ParameterizedTest
	@ValueSource(ints = {101,565,474,585,111,141,222,656,989,999,11,33,55,77 })
	void palindromes(int candidate) {
	    assertTrue(palindrome.ispalindrome(candidate));
	    System.out.println("Tested ...... Multiple test cases with @Parameterized Test anotation\n");
	}
	
	@BeforeClass
	@Test
	void StartEndTrueCheck() {
		assertTrue(start <= 10);
		assertTrue(end == 1000);
		assertTrue(length >= 0);
		System.out.println("Tested ...... BeforeClass with assertTrue and @Test anotatiom funtn\n");
	}

	@BeforeClass
	@Test
	void StartEndFalseCheck() {
		assertFalse(start != 10);
		assertFalse(end != 1000);
		assertFalse(length < 0 && length > 0);
		System.out.println("Tested ...... BeforeClass with assertFalse funtn and @Test anotation\n");
	}

	@Test
	void False() {
		assertFalse(palindrome.ispalindrome(344));
		assertFalse(palindrome.ispalindrome(778));
		assertFalse(palindrome.ispalindrome(998));
		assertFalse(palindrome.ispalindrome(122));
		assertFalse(palindrome.ispalindrome(322));
		assertFalse(palindrome.ispalindrome(12));
		assertFalse(palindrome.ispalindrome(0));
		assertFalse(palindrome.ispalindrome(998));
		System.out.println("Tested ...... Multiple FALSE test cases using assertFalse funtn and @Test anotation\n");
	}
	@AfterClass
	@Test
	void LengthCheck() {
		assertTrue(end>=1000);
		assertEquals(true,palindrome.len(99));
		System.out.println("Tested ...... AfterClass with assertTrue and @Test anotatiom funtn\n");
	}

}