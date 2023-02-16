package com.program1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PrimeTest {
	Prime prime = new Prime();
	int start = prime.Start;
	int end = prime.End;

	@BeforeClass
	@Test
	void StartEndTrueCheck() {
		assertTrue(start >= 0);
		assertTrue(end == 100);
		System.out.println("Tested ..... BeforeClass with assertTrue funtn and @Test anotation\n");
	}

	@Test
	void test() {
		assertEquals(prime.isPrime(11), true);
		assertEquals(prime.isPrime(13), true);
		assertEquals(prime.isPrime(17), true);
		assertEquals(prime.isPrime(71), true);
		assertEquals(prime.isPrime(47), true);
		assertEquals(prime.isPrime(97), true);
		assertEquals(prime.isPrime(83), true);
		assertEquals(prime.isPrime(37), true);
		System.out.println("Tested ....... Multiple test cases using assertEquals funtn without @parameterized test anotation\n");
	}

	@Test
	@AfterClass
	void After() {
		assertTrue(end >= 99);
		System.out.println("Tested ...... AfterClass with assertTrue and @Test anotatiom funtn\n");
	}

	@ParameterizedTest
	@ValueSource(ints = { 11, 13, 17, 71, 47, 97, 83, 37 })
	void palindromes(int candidate) {
		assertTrue(prime.isPrime(candidate));
		System.out.println("Tested ..... Multiple test cases with @Parameterized Test and @valuse Source anotation\n");
	}

	@BeforeClass
	@Test
	void StartEndFalseCheck() {
		assertFalse(start != 2);
		assertFalse(end != 100);
		System.out.println("tested ......BeforeClass with assertFalse funtn and @Test anotation\n");
	}

	@Test
	void False() {
		assertFalse(prime.isPrime(1));
		assertFalse(prime.isPrime(0));
		assertFalse(prime.isPrime(6));
		assertFalse(prime.isPrime(22));
		assertFalse(prime.isPrime(99));
		assertFalse(prime.isPrime(63));
		assertFalse(prime.isPrime(72));
		assertFalse(prime.isPrime(15));
		System.out.println("Tested ..... Multiple FALSE test cases using assertFalse funtn and @Test anotation\n");
	}

}
